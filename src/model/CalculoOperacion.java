package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

public class CalculoOperacion {
	
	private ArrayList<String> operation = new ArrayList<String>();
	private String strOperation;
	private NumberFormat df = new DecimalFormat("#0.000");
	
	public String getOperacion() {
		return strOperation;
	}
	
	public void setOperacion(String strOperacion) {
		this.strOperation = strOperacion;
		operation.clear();
	}
	
	public String calculateOperation() {
		String answer = "";
		crearArrayOperacion();
		if (operationSintax()) {
			answer = NumberFormat(performOperations());
		}else {
			answer = "Sintax Error";
		}
		return answer;
	}
	
	private boolean operationSintax() {
		boolean sintax = false;
		if(!strOperation.startsWith("+") || !strOperation.startsWith("-") || !strOperation.startsWith("*") || !strOperation.startsWith("/")) {
			if(!strOperation.endsWith("+") || !strOperation.endsWith("-") || !strOperation.endsWith("*") || !strOperation.endsWith("/")) {
				if(operation.size() == 1) {
					sintax = true;
				}else {
					if(operation.size()%2 != 0) {
						sintax = true;
					}
				}
			}
		}
		
		return sintax;
	}
	
	private void crearArrayOperacion() {
		String number = "";
		for(int i=0; i<strOperation.length(); i++) {
			if(strOperation.charAt(i) != '+' && strOperation.charAt(i) != '-' && strOperation.charAt(i) != '*' && strOperation.charAt(i) != '/') {
				number += strOperation.charAt(i);
			}else {
				if(number.equals("")) {
					break;
				}
				else {
					operation.add(number);
					operation.add(strOperation.charAt(i)+"");
					number = "";
				}					
			}
		}
		if(!number.equals(""))
			operation.add(number);
		System.out.println(operation);
	}
	
	private String performOperations() {
		ArrayList<String> reOperation = new ArrayList<String>();
		Operaciones op = new Operaciones();
		
		reOperation = operation;
		while(reOperation.size() != 1) {
			for(int i=1; i<operation.size(); i+=2) {
				if(operation.get(i).equals("*")) {
					reOperation.set(i-1, op.multiplication(Double.parseDouble(operation.get(i-1)), Double.parseDouble(operation.get(i+1)))+"");
				}else if(operation.get(i).equals("/")) {
					reOperation.set(i-1, op.division(Double.parseDouble(operation.get(i-1)), Double.parseDouble(operation.get(i+1)))+"");
				}
			}
			System.out.println(reOperation);
			for(int i=1; i<operation.size(); i+=2) {
				if(operation.get(i).equals("*")) {
					reOperation.remove(i);
					reOperation.remove(i);
				}else if(operation.get(i).equals("/")) {
					reOperation.remove(i);
					reOperation.remove(i);
				}
			}
			operation = reOperation;
			System.out.println(reOperation);
			for(int i=1; i<operation.size(); i+=2) {
				if(operation.get(i).equals("+")) {
					reOperation.set(i-1, op.sum(Double.parseDouble(operation.get(i-1)), Double.parseDouble(operation.get(i+1)))+"");
				}else if(operation.get(i).equals("-")) {
					System.out.println("yes");
					reOperation.set(i-1, op.subtraction(Double.parseDouble(operation.get(i-1)), Double.parseDouble(operation.get(i+1)))+"");
				}
			}
			for(int i=1; i<operation.size(); i+=2) {
				if(operation.get(i).equals("+")) {
					reOperation.remove(i);
					reOperation.remove(i);
				}else if(operation.get(i).equals("-")) {
					reOperation.remove(i);
					reOperation.remove(i);
				}
			}
			operation = reOperation;
		}
		
		System.out.println(reOperation);
		return reOperation.get(0);
	}
	
	
	private String NumberFormat(String answer) {
		return answer;
	}
	
}
