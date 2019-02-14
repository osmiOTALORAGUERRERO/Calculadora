package view;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame{

	public JButton jb_sum;
	public JButton jb_subtraction;
	public JButton jb_multiplication;
	public JButton jb_division;
	public JButton jb_clean;
	public JTextField jtf_number1;
	public JTextField jtf_number2;
	public JTextField jtf_answer;
	public JLabel jl_number1; 
	public JLabel jl_number2;
	public JLabel jl_answer;
	
	
	public CalculatorGUI(){
		
		setSize(290, 300);
		setLayout(null);
		Container ctn = this.getContentPane();
        ctn.setBackground(new Color(206,206,206));
		
		jb_sum = new JButton("suma");
		jb_sum.setBounds(15,155,80,40);		
		
		jb_subtraction = new JButton("resta");
		jb_subtraction.setBounds(80,155,80,40);
		
		jb_multiplication = new JButton("multi");
		jb_multiplication.setBounds(140,155,80,40);
		
		jb_division = new JButton("divis");
		jb_division.setBounds(200,155,80,40);
		
		jb_clean = new JButton("Clear");
		jb_clean.setBounds(95,220, 100, 30);
		
		jtf_number1 = new JTextField();
		jtf_number1.setBounds(100,20,150,30);
		
		jtf_number2 = new JTextField();
		jtf_number2.setBounds(100,60,150,30);
		
		jtf_answer = new JTextField();
		jtf_answer.setBounds(100,100,150,30);
		jtf_answer.setBackground(Color.WHITE);
		jtf_answer.setEditable(false);
		
		jl_number1 = new JLabel("Numero 1");
		jl_number1.setBounds(30,20,100,30);
		
		jl_number2 = new JLabel("Numero 2"); 
		jl_number2.setBounds(30,60,100,30);
		
		jl_answer = new JLabel("Resultado");
		jl_answer.setBounds(30,100,100,30);
		
		add(jl_number1);
		add(jtf_number1);
		add(jl_number2);
		add(jtf_number2);
		add(jl_answer);
		add(jtf_answer);
		add(jb_sum);
		add(jb_subtraction);
		add(jb_multiplication);
		add(jb_division);
		add(jb_clean);
		
	}
}