package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author osmi
 *
 */
public class Panel1 extends JPanel{
	
	public JTextField jtfOperation;
	public JButton jbClear; 
	/**
	 * En este creo la caja de texto con el boton de clear
	 */
	public Panel1() {
		
		setLayout(new BorderLayout());
		setBackground(new Color(255,234,157));
        jtfOperation = new JTextField();
        jtfOperation.setEditable(false);
        jtfOperation.setFont(new Font("Tahoma", Font.ITALIC, 30));
        jtfOperation.setBackground(new Color(255,234,157));
        
        jbClear = new JButton("cl");
        add(jtfOperation, BorderLayout.CENTER);
        add(jbClear, BorderLayout.EAST);
	}
}
