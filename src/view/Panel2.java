package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel2 extends JPanel{
	
	public JButton jb0;
	public JButton jb1;
	public JButton jb2;
	public JButton jb3;
	public JButton jb4;
	public JButton jb5;
	public JButton jb6;
	public JButton jb7;
	public JButton jb8;
	public JButton jb9;
	public JButton jbPoint;
	public JButton jbSum;
	public JButton jbSubtraction;
	public JButton jbMultiplication;
	public JButton jbDivision;
	public JButton jbEquals;
	
	public Panel2() {
		setLayout(new GridLayout(4,4,10,10));
		jb0 = new JButton("0");
		jb1 = new JButton("1");
		jb2 = new JButton("2");
		jb3 = new JButton("3");
		jb4 = new JButton("4");
		jb5 = new JButton("5");
		jb6 = new JButton("6");
		jb7 = new JButton("7");
		jb8 = new JButton("8");
		jb9 = new JButton("9");
		jbPoint = new JButton(".");
		jbSum = new JButton("+");
		jbSubtraction = new JButton("-");
		jbMultiplication = new JButton("*");
		jbDivision = new JButton("/");
		jbEquals = new JButton("=");
		add(jb7);
		add(jb8);
		add(jb9);
		add(jbDivision);
		add(jb4);
		add(jb5);
		add(jb6);
		add(jbMultiplication);
		add(jb1);
		add(jb2);
		add(jb3);
		add(jbSubtraction);
		add(jb0);
		add(jbPoint);
		add(jbEquals);
		add(jbSum);
	}
    
}
