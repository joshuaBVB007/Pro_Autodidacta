package ficheros;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffers_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//COMO LEER UN FICHERO.
		try {
			BufferedReader archivo=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\ficherito.txt"));
			String ln=archivo.readLine();
			while(ln != null){
				System.out.println(ln);
				ln=archivo.readLine();
			}
		} catch (Exception e) {
			System.out.println("archivo no encontrado");
		} 
		
		
		

	}
}