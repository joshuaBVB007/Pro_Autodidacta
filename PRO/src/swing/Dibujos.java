package swing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
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
		setBounds(20, 20, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(new Lamina(),BorderLayout.NORTH);
		add(new Lamina2(),BorderLayout.CENTER);
		//pack();
	}
}
class Lamina extends JPanel{
	private JButton B1=new JButton("0");
	public Lamina(){
		setLayout(new BorderLayout());
		add(B1,BorderLayout.NORTH);
		B1.setEnabled(false);
		
	}
}
class Lamina2 extends JPanel{
	private JButton B9=new JButton("9");
	private JButton B8=new JButton("8");
	private JButton B7=new JButton("7");
	private JButton B6=new JButton("6");
	private JButton B5=new JButton("5");
	private JButton B4=new JButton("4");
	private JButton B3=new JButton("3");
	private JButton B2=new JButton("2");
	private JButton B1=new JButton("1");
	private JButton BPunto=new JButton(".");
	private JButton BIgual=new JButton("=");
	private JButton B0=new JButton("0");
	public Lamina2(){
		GridLayout disposicion2=new GridLayout(4,4);
		setLayout(disposicion2);
		add(B9);
		add(B8);
		add(B7);
		add(B6);
		add(B5);
		add(B4);
		add(B3);
		add(B2);
		add(B1);
		add(BPunto);
		add(BIgual);
		add(B0);
	}
}





