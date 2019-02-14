package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import model.*;
import view.*;


public class Controller implements ActionListener{

	private CalculatorGUI objView;
	private Model objModel;
	
	public Controller(CalculatorGUI objView, Model objModel) 
	{
		this.objView = objView;
		this.objModel = objModel;	 
		
		this.objView.jb_sum.addActionListener(this);
		this.objView.jb_subtraction.addActionListener(this);
		this.objView.jb_multiplication.addActionListener(this);
		this.objView.jb_division.addActionListener(this);
		this.objView.jb_clean.addActionListener(this);
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
	

	public void startView()
	{
		objView.setTitle("Calcualdora");
		objView.setLocationRelativeTo(null);
		objView.jtf_number1.setText(""+objModel.getNumber1());
		objView.jtf_number2.setText(""+objModel.getNumber2());
	}
	
	private void metodoSuma()
	{
		try {
			objModel.setNumber1(Double.parseDouble(objView.jtf_number1.getText()));
			objModel.setNumber2(Double.parseDouble(objView.jtf_number2.getText()));
			objView.jtf_answer.setText(""+objModel.sum());			
		} catch (NumberFormatException  e) {
			JOptionPane.showMessageDialog(null, "Erro en un numero, evite letras y comas", "Error Numerico", JOptionPane.WARNING_MESSAGE);
		}
	}
	 
	private void metodoResta()
	{
		try {
			objModel.setNumber1(Double.parseDouble(objView.jtf_number1.getText()));
			objModel.setNumber2(Double.parseDouble(objView.jtf_number2.getText()));
			objView.jtf_answer.setText(""+objModel.subtraction());
		} catch (NumberFormatException  e) {
			JOptionPane.showMessageDialog(null, "Erro en un numero, evite letras y comas", "Error Numerico", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void metodoMultiplicar()
	{
		try {			
			objModel.setNumber1(Double.parseDouble(objView.jtf_number1.getText()));
			objModel.setNumber2(Double.parseDouble(objView.jtf_number2.getText()));
			objView.jtf_answer.setText(""+objModel.multiplication());
		} catch (NumberFormatException  e) {
			JOptionPane.showMessageDialog(null, "Erro en un numero, evite letras y comas", "Error Numerico", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void metodoDividir()
	{
		try {
			objModel.setNumber1(Double.parseDouble(objView.jtf_number1.getText()));
			objModel.setNumber2(Double.parseDouble(objView.jtf_number2.getText()));
			objView.jtf_answer.setText(""+objModel.division());
		} catch (NumberFormatException  e) {
			JOptionPane.showMessageDialog(null, "Erro en un numero, evite letras y comas", "Error Numerico", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void cleanScreen() {
		objView.jtf_number1.setText("0.0");
		objView.jtf_number2.setText("0.0");
		objView.jtf_answer.setText("");
	}
}