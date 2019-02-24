package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import model.*;
import view.*;


public class Controller implements ActionListener{

	private CalculatorGUI objView;
	private CalculoOperacion objModel;
	
	public Controller(CalculatorGUI objView, CalculoOperacion objModel) 
	{
		this.objView = objView;
		this.objModel = objModel;
		this.objView.jpPanel1.jbClear.addActionListener(this);
		this.objView.jpPanel2.jbEquals.addActionListener(this);
	}
	
	public void startView() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		if(e.getSource() == this.objView.jpPanel2.jbEquals) {
			calculateResult();
		}else if(e.getSource() == this.objView.jpPanel1.jbClear) {
			clearScreen();
		}
	}
	
	public void calculateResult() {
		this.objModel.setOperacion(objView.jpPanel1.jtfOperation.getText());
		this.objView.jpPanel1.jtfOperation.setText(objModel.calculateOperation());
	}
	
	public void clearScreen() {
		this.objView.jpPanel1.jtfOperation.setText("");
	}
}