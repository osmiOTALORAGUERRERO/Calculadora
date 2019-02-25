package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

public class CalculoOperacion {
	
	private ArrayList<String> operation = new ArrayList<String>();
	private String strOperation;
	private NumberFormat df = new DecimalFormat("#0.00");
	private Operaciones op = new Operaciones();	
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
			answer = performOperations(operation);
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
	
	private String performOperations(ArrayList<String> operation) {	
		int index = 0;
		String operator = "";
		
		if(operation.contains("*") && operation.contains("/")) {
			if(operation.indexOf("*") < operation.indexOf("/"))
				operator = "*";
			else 
				operator = "/";
		}else {
			if(operation.contains("*"))
				operator = "*";
			else if(operation.contains("/"))
				operator = "/";
		}
		if(operator.equals("*")) {
			index = operation.indexOf(operator);
			operation.set(index-1, op.multiplication(Double.parseDouble(operation.get(index-1)), Double.parseDouble(operation.get(index+1)))+"");
		}else if(operator.equals("/")) {
			index = operation.indexOf(operator);
			operation.set(index-1, op.division(Double.parseDouble(operation.get(index-1)), Double.parseDouble(operation.get(index+1)))+"");
		}
		if(!operator.equals("")) {
			operation.remove(operator);
			operation.remove(index);
			System.out.println(operation);
			return performOperations(operation);
		}
		
		if(operation.contains("+") && operation.contains("-")) {
			if(operation.indexOf("+") < operation.indexOf("-"))
				operator = "+";
			else 
				operator = "-";
		}else {
			if(operation.contains("+"))
				operator = "+";
			else if(operation.contains("-"))
				operator = "-";
		}		
		if(operator.equals("+")) {
			index = operation.indexOf(operator);
			operation.set(index-1, op.sum(Double.parseDouble(operation.get(index-1)), Double.parseDouble(operation.get(index+1)))+"");
		}else if(operator.equals("-")) {
			index = operation.indexOf(operator);
			operation.set(index-1, op.subtraction(Double.parseDouble(operation.get(index-1)), Double.parseDouble(operation.get(index+1)))+"");
		}
		if(!operator.equals("")) {			
			operation.remove(operator);
			operation.remove(index);
			System.out.println(operation);
			return performOperations(operation);	
		}
		
		return operation.get(0);
	}
	
}
