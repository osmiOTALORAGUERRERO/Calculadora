package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Model {
	
	private double number1 = 0.0;
	private double number2 = 0.0;

	private NumberFormat df = new DecimalFormat("#0.000");
	
	public double getNumber1() {
		return number1;
	}
	
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	
	public double getNumber2() {
		return number2;
	}
	
	public void setNumber2(double number2) {
		this.number2 = number2;
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
