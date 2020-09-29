package Acceso_Ficheros;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame4 e=new Frame4();
	}
}

class Frame4 extends JFrame{	
	public Frame4(){
		setBounds(20, 20, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ventana Prueba");
		setVisible(true);
		JLabel t1=new JLabel("Primer operando");
		JLabel t2=new JLabel("Segundo Operando");
		JLabel t3=new JLabel("Resultado");
		final JTextField et1=new JTextField("");
		final JTextField et2=new JTextField("");
		final JTextField et3=new JTextField("");
		JButton B1=new JButton("+");
		JButton B2=new JButton("-");
		JButton B3=new JButton("*");
		JButton B4=new JButton("/");
		JButton B5=new JButton("salir");
		Container cp=getContentPane();
		JPanel g=new JPanel();
		JPanel h=new JPanel();
		cp.setLayout(new GridLayout(3,1));
		g.setLayout(new GridLayout(2,3));
		h.setLayout(new GridLayout(1,5));
		cp.add(g);
		cp.add(h);
		g.add(t1);
		g.add(t2);
		g.add(t3);
		g.add(et1);
		g.add(et2);
		g.add(et3);
		h.add(B1);
		h.add(B2);
		h.add(B3);
		h.add(B4);
		h.add(B5);
		et3.setEditable(false);
		pack();
		
		
		B1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int suma=0;
				suma=Integer.valueOf(et1.getText().toString())+Integer.valueOf(et2.getText().toString());
				et3.setText(Integer.toString(suma));
			}
		});
		
		
		B2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int resta=0;
				resta=Integer.valueOf(et1.getText().toString())-Integer.valueOf(et2.getText().toString());
				et3.setText(Integer.toString(resta));		
			}
		});
		
		
		B3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int multi=0;
				multi=Integer.valueOf(et1.getText().toString())*Integer.valueOf(et2.getText().toString());
				et3.setText(Integer.toString(multi));		
			}
		});
		
		
		B4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int div=0;
				div=Integer.valueOf(et1.getText().toString())/Integer.valueOf(et2.getText().toString());
				et3.setText(Integer.toString(div));		
			}
		});
		
		
		B5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);;	
			}
		});
		
		
	
	}
}

