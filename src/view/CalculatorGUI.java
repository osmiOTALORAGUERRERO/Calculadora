package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame{

	public JPanel jpPanel1;
	public JPanel jpPanel2;
	
	public CalculatorGUI(){
		
		setSize(300, 300);
		setLayout(new BorderLayout());
		Container ctn = this.getContentPane();
        ctn.setBackground(new Color(206,206,206));
        
        jpPanel1 = new JPanel();
        jpPanel1.setLayout(new BorderLayout());
        JTextField jtfOperation = new JTextField();
        jtfOperation.setEditable(false);
        JButton jbClear = new JButton("cl");
        jpPanel1.add(jtfOperation, BorderLayout.CENTER);
        jpPanel1.add(jbClear, BorderLayout.EAST);
        
        
        jpPanel2 = new JPanel();
        jpPanel2.setLayout(new GridLayout(4,4,10,10));
    	JButton jb0 = new JButton("0");
    	JButton jb1 = new JButton("1");
    	JButton jb2 = new JButton("2");
    	JButton jb3 = new JButton("3");
    	JButton jb4 = new JButton("4");
    	JButton jb5 = new JButton("5");
    	JButton jb6 = new JButton("6");
    	JButton jb7 = new JButton("7");
    	JButton jb8 = new JButton("8");
    	JButton jb9 = new JButton("9");
    	JButton jbPoint = new JButton(".");
    	JButton jbSum = new JButton("+");
    	JButton jbSubtraction = new JButton("-");
    	JButton jbMultiplication = new JButton("*");
    	JButton jbDivision = new JButton("/");
    	JButton jbEquals = new JButton("=");
    	jpPanel2.add(jb7);
    	jpPanel2.add(jb8);
    	jpPanel2.add(jb9);
    	jpPanel2.add(jbDivision);
    	jpPanel2.add(jb4);
    	jpPanel2.add(jb5);
    	jpPanel2.add(jb6);
    	jpPanel2.add(jbMultiplication);
    	jpPanel2.add(jb1);
    	jpPanel2.add(jb2);
    	jpPanel2.add(jb3);
    	jpPanel2.add(jbSubtraction);
    	jpPanel2.add(jb0);
    	jpPanel2.add(jbPoint);
    	jpPanel2.add(jbEquals);
    	jpPanel2.add(jbSum);
        
    	add(jpPanel1, BorderLayout.NORTH);
    	add(jpPanel2, BorderLayout.CENTER);
	}
}