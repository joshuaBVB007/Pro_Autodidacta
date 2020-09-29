package ficheros;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileReader_ {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub 
		
		
		try {
			FileReader f = new FileReader(new File("C:\\Users\\Usuario\\Desktop\\ficherito.txt"));
			int i=0;
	        while(i != -1){
	        	i=f.read(); //devuleve caracteres decodificados
	        	char et=(char)i;//pasa binario-->caracter 	        	
	        	if(i==-1){// el caracter -1 equivale al ultimo caracter
	        		break;
	        	}
	        	System.out.print(et);
	        }     
		} catch (Exception el) {
			System.out.println("no se ha podido leer el fichero");
		} 
		
		
		
	}
}
