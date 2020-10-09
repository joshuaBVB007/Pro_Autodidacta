package clase_Eduardo_Lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Crear_Ficheros {
	
	public static void main(String[] args) {
		
		while(true) {
			
			Scanner ets=new Scanner(System.in);
			System.out.println("Que quieres hacer?\n1=listar archivos y ficheros de una carpeta\n2-crear un fichero\n3-crear una carpeta");
			int decision=ets.nextInt();
			
			if(decision>3) {
				System.out.println("Hemos terminado");
				break;
			}
			
			Scanner line=new Scanner(System.in);
			System.out.println("introduce el nombre del documento o carpeta");
			String nombre=line.nextLine();
			
			if(decision==1) {
				
				String ruta="/home/cf19jonathan.ascencio/Escriptori/"+nombre;
				File et=new File(ruta);
				String [] ficheros=et.list();
				if(ficheros==null) {
					System.out.println("no hay ficheros en el directorio");
				}else {
					for (int i = 0; i < ficheros.length; i++) {
						File pepe=new File(ruta+"/"+ficheros[i]);
						if(pepe.isDirectory()) {
							System.out.println("<DIR>"+pepe.getName());
						}else {
							System.out.println("<File>"+pepe.getName());
						}
					}
				}
			}	
			else if(decision==2) {
				String ruta1="/home/cf19jonathan.ascencio/Escriptori/"+nombre;
				File et2=new File(ruta1);
				
				try {
					et2.createNewFile();
					System.out.println("fichero creado en el escritorio con exito");
				} catch (IOException e1) {
					System.out.println("fichero no creado");
				}
				
			}
			else if(decision==3) {
				String ruta11="/home/cf19jonathan.ascencio/Escriptori/"+nombre;
				File et21=new File(ruta11);
				
				et21.mkdir();
				System.out.println("carpeta creada con exito");
			}
		}
		
		
	}		
}
