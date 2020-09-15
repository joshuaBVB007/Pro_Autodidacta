package swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graficos2D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V ventana=new V();		
	}
}
class V extends JFrame{	
	public V(){
		setBounds(10,10,100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(new Lami());
	}
}
class Lami extends JPanel{
	public void paintComponent(Graphics t){
		super.paintComponent(t);
		Graphics2D g2=(Graphics2D)t;
		Rectangle2D morena=new Rectangle2D.Double(10,10,100,100);
		g2.draw(morena);
	}
}