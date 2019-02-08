package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		 objModel.setNumber1(Double.parseDouble(objView.jtf_number1.getText()));
		 objModel.setNumber2(Double.parseDouble(objView.jtf_number2.getText()));
		 objView.jtf_answer.setText(""+objModel.sum());
	}
	 
	private void metodoResta()
	{
		objModel.setNumber1(Double.parseDouble(objView.jtf_number1.getText()));
		objModel.setNumber2(Double.parseDouble(objView.jtf_number2.getText()));
		objView.jtf_answer.setText(""+objModel.subtraction());
	}
	
	private void metodoMultiplicar()
	{
		objModel.setNumber1(Double.parseDouble(objView.jtf_number1.getText()));
		objModel.setNumber2(Double.parseDouble(objView.jtf_number2.getText()));
		objView.jtf_answer.setText(""+objModel.multiplication());
	}
	
	private void metodoDividir()
	{
		objModel.setNumber1(Double.parseDouble(objView.jtf_number1.getText()));
		objModel.setNumber2(Double.parseDouble(objView.jtf_number2.getText()));
		objView.jtf_answer.setText(""+objModel.division());
	}
	
	public void cleanScreen() {
		objView.jtf_number1.setText("0.0");
		objView.jtf_number2.setText("0.0");
		objView.jtf_answer.setText("");
	}
}