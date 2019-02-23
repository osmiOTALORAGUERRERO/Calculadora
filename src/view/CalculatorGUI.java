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
        
    	add(jpPanel1, BorderLayout.NORTH);
    	add(jpPanel2, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}