package model;

import java.util.ArrayList;
/**
 * In this class is the that perform operation
 * @author osmi
 *
 */
public class Calculation {
	
	private ArrayList<String> operation = new ArrayList<String>();
	private String strOperation;
	private Operations op = new Operations();
	/**
	 * get operation
	 * @return
	 */
	public String getOperation() {
		return strOperation;
	}
	/**
	 * set operation
	 * @param strOperacion
	 */
	public void setOperacion(String strOperacion) {
		this.strOperation = strOperacion;
		operation.clear();
	}
	/**
	 * Esta funcion realiza la operacion con ayuda de otros metodos
	 * @return
	 */
	public String calculateOperation() {
		String answer = "";
		createOperationArray();
		if (operationSintax()) {
			answer = performOperations(operation);
			if(answer.equals("Infinity")) {
				answer = "division error by zero";
			}
		}else {
			answer = "Sintax Error";
		}
		return answer;
	}
	/**
	 * Revisa si la sintaxis del string de la operacion es correcto
	 * @return
	 */
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
	/**
	 * Crea la operacion en el arraylist operation segun el estring
	 * con ese array se podra realizar el calculo de la operacion
	 */
	private void createOperationArray() {
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
	}
	/**
	 * Aqui realizo la operacion dando el resultado final 
	 * @param operation
	 * @return
	 */
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
			return performOperations(operation);	
		}
		
		return operation.get(0);
	}
	
}
