package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Vista extends JFrame{
	
	public JButton jb_suma;
	public JButton jb_resta;
	public JButton jb_multiplicacion;
	public JButton jb_dividir;
	public JTextField jtf_numero1;
	public JTextField jtf_numero2;
	public JTextField jtf_resultado;
	public JDialog jd_numero1; 
	
	
	public void Vista(){
		
		setSize(100, 100);
		
	}
}
