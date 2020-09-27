package ficheros;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class Bytes_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int [] lista=new int [7407];
		try {
			FileInputStream s=new FileInputStream("C:\\Users\\Usuario\\Desktop\\Android\\banana.jpeg");
			boolean frenar=false;
			
			while(!frenar==true){		
				int receptor=s.read();	
				
				if(receptor != -1){
					lista[contador]=receptor;
				}				
				else{
					frenar=true;
				}
				System.out.println(lista[contador]);
				contador++;
			}
			s.close();
			recrearImagen(lista);
			
			
		} catch (Exception e) {
			System.out.println("Imagen no encontrada");
		}
		
		
		
	}
	
	
	static void recrearImagen(int [] lista){
		try {
			FileOutputStream et=new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Android\\joroba.jpeg");
			
			for (int i = 0; i < lista.length; i++) {
				et.write(lista[i]);
			}
			
			
		} catch (Exception e) {
			System.out.println("No se ha recreado la imagen");
		}
		
		
	}
	
	
}
