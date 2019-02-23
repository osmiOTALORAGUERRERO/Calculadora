package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel1 extends JPanel{
	
	public JTextField jtfOperation;
	public JButton jbClear; 
	
	public Panel1() {
		
		setLayout(new BorderLayout());
        jtfOperation = new JTextField();
        jtfOperation.setEditable(false);
        jbClear = new JButton("cl");
        add(jtfOperation, BorderLayout.CENTER);
        add(jbClear, BorderLayout.EAST);
	}
}
