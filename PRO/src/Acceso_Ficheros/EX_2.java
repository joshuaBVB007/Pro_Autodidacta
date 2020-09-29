package Acceso_Ficheros;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame2 z=new Frame2();

	}

}

class Frame2 extends JFrame{	
	public Frame2(){
		setBounds(20, 20, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Ventana Prueba");
		Lamina2 e=new Lamina2();
		e.setLayout(new FlowLayout());
		add(e,BorderLayout.NORTH);
		pack();
	}
}


class Lamina2 extends JPanel implements ActionListener{
	JButton p=new JButton("primero");
	JButton s=new JButton("segundo");
	JLabel texto=new JLabel("botones");
	JTextField t=new JTextField("nada");
	public Lamina2(){
		add(texto);
		add(p);
		add(s);
		add(t);
		p.addActionListener(this);
		s.addActionListener(this);
	}
	public void actionPerformed(ActionEvent arg0){
		Object boton_pulsado=arg0.getSource();
		if(boton_pulsado.equals(p)){
			t.setText("Hello"); //JTextComponent es la clase poseedora de el metodo setText()
			setBackground(Color.CYAN);
		}else if(boton_pulsado.equals(s)){
			t.setText("Adios");
			setBackground(Color.BLUE);
		}
	}
}
