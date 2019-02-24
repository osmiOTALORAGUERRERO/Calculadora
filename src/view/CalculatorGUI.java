package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CalculatorGUI extends JFrame implements ActionListener{

	public Panel1 jpPanel1;
	public Panel2 jpPanel2;
	
	public CalculatorGUI(){
		
		setSize(300, 300);
		setLayout(new BorderLayout());
		Container ctn = this.getContentPane();
        ctn.setBackground(new Color(206,206,206));
        
        jpPanel1 = new Panel1();
        jpPanel2 = new Panel2();
        
        actionButtonsp2();
        
    	add(jpPanel1, BorderLayout.NORTH);
    	add(jpPanel2, BorderLayout.CENTER);
	}
	
	private void actionButtonsp2() {
		jpPanel2.jb0.addActionListener(this);
		jpPanel2.jb1.addActionListener(this);
		jpPanel2.jb2.addActionListener(this);
		jpPanel2.jb3.addActionListener(this);
		jpPanel2.jb4.addActionListener(this);
		jpPanel2.jb5.addActionListener(this);
		jpPanel2.jb6.addActionListener(this);
		jpPanel2.jb7.addActionListener(this);
		jpPanel2.jb8.addActionListener(this);
		jpPanel2.jb9.addActionListener(this);
		jpPanel2.jbPoint.addActionListener(this);
		jpPanel2.jbSum.addActionListener(this);
		jpPanel2.jbSubtraction.addActionListener(this);
		jpPanel2.jbMultiplication.addActionListener(this);
		jpPanel2.jbDivision.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jpPanel2.jb0) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"0");
		}else if(e.getSource() == jpPanel2.jb1) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"1");
		}else if(e.getSource() == jpPanel2.jb2) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"2");
		}else if(e.getSource() == jpPanel2.jb3) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"3");
		}else if(e.getSource() == jpPanel2.jb4) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"4");
		}else if(e.getSource() == jpPanel2.jb5) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"5");
		}else if(e.getSource() == jpPanel2.jb6) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"6");
		}else if(e.getSource() == jpPanel2.jb7) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"7");
		}else if(e.getSource() == jpPanel2.jb8) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"8");
		}else if(e.getSource() == jpPanel2.jb9) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"9");
		}else if(e.getSource() == jpPanel2.jbPoint) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+".");
		}else if(e.getSource() == jpPanel2.jbSum) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"+");
		}else if(e.getSource() == jpPanel2.jbSubtraction) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"-");
		}else if(e.getSource() == jpPanel2.jbMultiplication) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"*");
		}else if(e.getSource() == jpPanel2.jbDivision) {
			jpPanel1.jtfOperation.setText(jpPanel1.jtfOperation.getText()+"/");
		}
		
	}
}