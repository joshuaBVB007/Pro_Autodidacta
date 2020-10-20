package sockets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana1 este=new Ventana1();

	}
}

class Ventana1 extends JFrame{
	public Ventana1(){
		setBounds(100,100,600,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Lamina1());
	}
}

class Lamina1 extends JPanel{
	JTextArea e=new JTextArea("");
	public Lamina1(){
		add(e);
	}
}	
