package main;

import controller.*;
import model.*;
import view.*;

/**
 * 
 * @author osmi Santiago Otalora Guerrero
 *
 */
public class Calculator {
	
	/**
	 * In this function the program run start
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculation objModel = new Calculation();
		CalculatorGUI objView = new CalculatorGUI();
		Controller controller = new Controller(objView, objModel);
		controller.startView();
	}

}
