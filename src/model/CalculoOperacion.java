package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class CalculoOperacion {
	
	private ArrayList<String> operacion = new ArrayList<String>();
	private String strOperacion;
	private String resultado = "0";
	private NumberFormat df = new DecimalFormat("#0.000");
	
	public String getOperacion() {
		return strOperacion;
	}
	
	public void setOperacion(ArrayList<String> operacion) {
		this.operacion = operacion;
	}
	
	public String calcular() {
		
		return resultado;
	}
	
	public boolean sintaxisCorrecta() {
		return false;
	}
	
	public void crearArrayOperacion() {
		
	}
	
	public void realizarOperaciones() {
		
	}
	
	
	public void formatoNumero() {
		
	}
	
}
