package ficheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriter_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File p=new File("C:\\Users\\Usuario\\Desktop\\ficherito.txt");
		try {
			FileWriter g=new FileWriter(p);
			g.write("Cervecita Perros! ");
			g.close();
			
		} catch (IOException e) {
			System.out.println("no se pudo escribir en el fichero");
		}
		

	}

}
