package eventos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Click_Evento {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadro marco_juego=new Cuadro();
		marco_juego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco_juego.setVisible(true);
		
	}
}
class Cuadro extends JFrame{//clase que brinda las propiedades de nuestro cuadro
	public Cuadro(){
		Toolkit screen=Toolkit.getDefaultToolkit();
		Dimension e=screen.getScreenSize();
		int alto=e.height;
		int ancho=e.width;
		setSize(ancho/2,alto/2);
		setLocation(alto/4,ancho/4);
		setTitle("Jonathan");
		Lamina lamina1=new Lamina();
		add(lamina1);
		
	}
}

class Lamina extends JPanel implements ActionListener{//clase que crea Laminas
	JButton Boton_Rojo=new JButton("Rojo");
	JButton Boton_Azul=new JButton("Azul");
	public Lamina(){
		add(Boton_Azul);
		add(Boton_Rojo);
		Boton_Azul.addActionListener(this);//al poner this le informamos que el oyente es la lamina
		Boton_Rojo.addActionListener(this);
	}
	public void paintComponent(Graphics e){//METODO PARA DIBUJAR EN LA LAMINA
		super.paintComponent(e);
		e.drawString("Hola soy Jonathan", 20,20);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {//EVENTO DE CLICK
		// TODO Auto-generated method stub
		Object boton_pulsado=arg0.getSource();
		if(boton_pulsado.equals(Boton_Azul)){
			setBackground(Color.blue);
		}else if(boton_pulsado.equals(Boton_Rojo)){
			setBackground(Color.RED);
		}
	}
	
	
}