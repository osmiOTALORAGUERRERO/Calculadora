package main;

import controller.*;
import model.*;
import view.*;

public class Calculator {

	public static void main(String[] args) {
		Model objModel = new Model();
		CalculatorGUI objView = new CalculatorGUI();

		Controller controller = new Controller(objView, objModel);
		controller.startView();
		objView.setVisible(true);

	}

}
