package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Model {
	
	private String operacion = "0";
	private String resultado;
	private NumberFormat df = new DecimalFormat("#0.000");
	
	public String getOperacion() {
		return operacion;
	}
	
	public String setOperacion(double operacion) {
		this.operacion = operacion;
	}

	public String sum(){
		return df.format(this.number1 + this.number2);
	}
	
	public String subtraction(){
		return df.format(this.number1 - this.number2);
	}
	
	public String multiplication(){
		return df.format(this.number1 * this.number2);
	}
	
	public String division(){
		return df.format(this.number1 / this.number2);
	}
}
