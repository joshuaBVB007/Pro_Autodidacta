package poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;
public class InnerClass_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relog ohara=new Relog(3000,true);
		ohara.enMarcha();
		JOptionPane.showMessageDialog(null,"presiona para salir");
		System.exit(0);
	}
}
class Relog{
	private boolean sonido;
	private int intervalo;
	public Relog(int intervalo,boolean sonido){
		this.intervalo=intervalo;
		this.sonido=sonido;
	}
	public void enMarcha(){
		ActionListener e=new C();
		Timer et=new Timer(1000,e);
		et.start();
	}
	private class C implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent a) {
			Date horaActual=new Date();
			System.out.println("la hora es "+horaActual);	
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}else{
				System.out.println("algo ha fallado");
			}
		}	
	}
}


