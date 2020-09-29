package Acceso_Ficheros;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame e=new Frame();

	}

}

class Frame extends JFrame{	
	public Frame(){
		setBounds(20, 20, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Ventana Prueba");
		Lamina e=new Lamina();
		e.setLayout(new FlowLayout());
		add(e,BorderLayout.NORTH);
		pack();
	}
}


class Lamina extends JPanel {
	JButton p=new JButton("primero");
	JButton s=new JButton("segundo");
	JLabel texto=new JLabel("botones");
	public Lamina(){
		add(texto);
		add(p);
		add(s);
	}
	
}
