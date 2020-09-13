package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dibujos {
	public static void main(String[] args) {
		frame c=new frame();
				
	}
}
class frame extends JFrame{
	public frame(){
		setBounds(20, 20, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(new Lamina());
	}
}
class Lamina extends JPanel{
	private JButton B1=new JButton("hola");
	private JButton B2=new JButton("hola");
	private JButton B3=new JButton("hola");
	public Lamina(){
		setBackground(Color.black);
		add(B1);
		add(B2);
		add(B3);
	}
}





