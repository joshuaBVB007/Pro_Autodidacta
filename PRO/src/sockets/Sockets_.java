package sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sockets_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana miframe=new Ventana();
		
		
	}

}

class Ventana extends JFrame{
	public Ventana(){
		setBounds(100,100,600,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Lamina());
	}
}

class Lamina extends JPanel{
	JLabel e=new JLabel("Vamos a hacer una prueba");
	JTextField et=new JTextField("Introduce una palabra");
	JButton negro=new JButton("enviar");
	public Lamina(){
		add(e);
		add(et);
		negro.addActionListener(new enviar());
		add(negro);
	}
	
	private class enviar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//System.out.println(et.getText());
			try {
				Socket misocket=new Socket("192.168.1.136",9999);
				DataOutputStream este=new DataOutputStream(misocket.getOutputStream());
				este.writeUTF(et.getText());
				/*lo que hemos puesto en UTF es lo que viajara
				a traves del socket*/
				este.close();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
