package clase_Eduardo_Lara;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Aleatorio_2{
	static RandomAccessFile archivo;
	static void escribir(String nom){
		try {
			archivo.seek(archivo.length());
			archivo.writeUTF(nom);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static boolean leer(String nom) throws IOException{
		archivo.seek(0);
		while(archivo.getFilePointer()<archivo.length()){
			if(archivo.readUTF().equals(nom)){
				archivo.skipBytes(6);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
        try {
            archivo = new RandomAccessFile(new File("C:\\Users\\Usuario\\Desktop\\Lamina.txt"),"rw");
        }catch(Exception ex){
            System.err.println("Fichero no existe "+ex);
        }
        
        while(true){
        	Scanner e=new Scanner(System.in);
        	System.out.println("Que quieres hacer?\n1-crear un empleado\n2-Salir");
        	int decision=e.nextInt();
        	
        	if(decision==1){
        		Scanner et=new Scanner(System.in);
            	System.out.println("Introduce el nombre: ");
            	String nombre=et.nextLine();
        		escribir(nombre);
        	}else if(decision>1 || decision<1){
        		try {
					archivo.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		break;
        	}
        	
        	
        	
        }
        
        
        
        
  }
}






        
