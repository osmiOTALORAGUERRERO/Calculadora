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
		
		this.objView.jpPanel2.jbEquals.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		if (e.getSource() == this.objView.jb_sum)
			metodoSuma();
		else if (e.getSource() == this.objView.jb_subtraction)
			metodoResta();
		else if (e.getSource() == this.objView.jb_multiplication)
			metodoMultiplicar();
		else if(e.getSource() == this.objView.jb_division)
			metodoDividir();
		else if(e.getSource() == this.objView.jb_clean)
			cleanScreen();
	}
	

	
	
	public void cleanScreen() {
		objView.jtf_number1.setText("0.0");
		objView.jtf_number2.setText("0.0");
		objView.jtf_answer.setText("");
	}
}