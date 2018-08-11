package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame{

	public JButton jb_suma;
	public JButton jb_resta;
	public JButton jb_multiplicacion;
	public JButton jb_dividir;
	public JTextField jtf_numero1;
	public JTextField jtf_numero2;
	public JTextField jtf_resultado;
	public JLabel jl_numero1; 
	public JLabel jl_numero2;
	public JLabel jl_resultado;
	
	public Vista(){
		
		setSize(300, 300);
		setLayout(null);
		
		JButton jb_suma = new JButton("+");
		jb_suma.setBounds(25,200,50,50);
		
		
		JButton jb_resta = new JButton("-");
		jb_resta.setBounds(85,200,50,50);
		
		JButton jb_multiplicacion = new JButton("*");
		jb_multiplicacion.setBounds(145,200,50,50);
		
		JButton jb_dividir = new JButton("/");
		jb_dividir.setBounds(205,200,50,50);
		
		JTextField jtf_numero1 = new JTextField();
		jtf_numero1.setBounds(100,20,150,30);
		
		JTextField jtf_numero2 = new JTextField();
		jtf_numero2.setBounds(100,60,150,30);
		
		JTextField jtf_resultado = new JTextField();
		jtf_resultado.setBounds(100,100,150,30);
		jtf_resultado.setBackground(Color.WHITE);
		jtf_resultado.setEditable(false);
		
		JLabel jl_numero1 = new JLabel("Numero 1");
		jl_numero1.setBounds(30,20,100,30);
		
		JLabel jl_numero2 = new JLabel("Numero 2"); 
		jl_numero2.setBounds(30,60,100,30);
		
		JLabel jl_resultado = new JLabel("Resultado");
		jl_resultado.setBounds(30,100,100,30);
		
		add(jl_numero1);
		add(jtf_numero1);
		add(jl_numero2);
		add(jtf_numero2);
		add(jl_resultado);
		add(jtf_resultado);
		add(jb_suma);
		add(jb_resta);
		add(jb_multiplicacion);
		add(jb_dividir);
		
	}
}
