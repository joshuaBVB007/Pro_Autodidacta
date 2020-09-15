package swing;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicS {
	/**Pasos:
	 * crear Lamina
	 * reescribir el metodo paintComponent()
	 * crear la variable graphics en el metodo paintComponent
	 * utilizar el metodo drawString y finich!
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Ventana frame=new Ventana();
	}
}
class Ventana extends JFrame{	
	public Ventana(){
		setBounds(10,10,100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(new LaminaSuperior());
	}
}
class LaminaSuperior extends JPanel{
	public void paintComponent(Graphics e){
		super.paintComponent(e);
		e.drawString("Soy Jonathan Calderon", 10, 100);
	}
}

