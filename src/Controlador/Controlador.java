package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;


public class Controlador implements ActionListener{

	private Vista objVista;
	private Modelo ObjModelo;
	
	public Controlador(Vista objVista, Modelo ObjModelo) 
	{
		this.objVista = objVista;
		this.ObjModelo = ObjModelo;	 
		
		this.objVista.jb_suma.addActionListener(this);
		this.objVista.jb_resta.addActionListener(this);
		this.objVista.jb_multiplicacion.addActionListener(this);
		this.objVista.jb_dividir.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == this.objVista.jb_suma)
		{
			metodoSuma();
		}else if (e.getSource() == this.objVista.jb_resta){
			metodoResta();
		}else if (e.getSource() == this.objVista.jb_multiplicacion){
			metodoMultiplicar();
		}else if(e.getSource() == this.objVista.jb_dividir){
			metodoDividir();
		}
	}
	
	public void iniciar_vista()
	{
		objVista.setTitle("Calcualdora");
		objVista.setLocationRelativeTo(null);
		objVista.jtf_numero1.setText(""+ObjModelo.getNumero1());
		objVista.jtf_numero2.setText(""+ObjModelo.getNumero2());
	}
	
	 private void metodoSuma()
	 {
		 ObjModelo.setNumero1(Double.parseDouble(objVista.jtf_numero1.getText()));
		 ObjModelo.setNumero2(Double.parseDouble(objVista.jtf_numero2.getText()));
		 objVista.jtf_resultado.setText(""+ObjModelo.suma());
	}
	 
	private void metodoResta()
	{
		ObjModelo.setNumero1(Double.parseDouble(objVista.jtf_numero1.getText()));
		ObjModelo.setNumero2(Double.parseDouble(objVista.jtf_numero2.getText()));
		objVista.jtf_resultado.setText(""+ObjModelo.resta());
	}
	
	private void metodoMultiplicar()
	{
		ObjModelo.setNumero1(Double.parseDouble(objVista.jtf_numero1.getText()));
		ObjModelo.setNumero2(Double.parseDouble(objVista.jtf_numero2.getText()));
		objVista.jtf_resultado.setText(""+ObjModelo.multiplicacion());
	}
	
	private void metodoDividir()
	{
		ObjModelo.setNumero1(Double.parseDouble(objVista.jtf_numero1.getText()));
		ObjModelo.setNumero2(Double.parseDouble(objVista.jtf_numero2.getText()));
		objVista.jtf_resultado.setText(""+ObjModelo.division());
	}
	
}
