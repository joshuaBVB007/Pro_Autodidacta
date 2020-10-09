package Acceso_Ficheros;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EX_4 {

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
		setTitle("Practica");
		Lamina2 e=new Lamina2();
		e.setLayout(new GridLayout(1,2));
		add(e);
		pack();
	}
}


class Lamina2 extends JPanel implements ActionListener{
	JButton p=new JButton("Leer fichero");
	JTextArea t=new JTextArea(100,100);
	public Lamina2(){
		add(p);
		add(t);
		p.addActionListener(this);
	}
	public void actionPerformed(ActionEvent arg0){
		Object boton_pulsado=arg0.getSource();
		if(boton_pulsado.equals(p)){
			String ln;
			try {
				File e=new File("C:\\Users\\Usuario\\Desktop\\ficherito.txt");
				BufferedReader archivo=new BufferedReader(new FileReader(e));

				ln = archivo.readLine();
				String texto="";
				while(ln != null){
					texto+=ln.concat("\n");
					ln=archivo.readLine();
					
				}
				t.setText(texto);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
			
		}
	}
}
