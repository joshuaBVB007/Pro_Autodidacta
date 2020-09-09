package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jonathan {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try {
				System.out.println("introduce algo! ");
				String line=bf.readLine();
				Integer nuevo=new Integer(line);
			} catch (Exception e) {
				System.out.println("al parecer ingresaste una letra o caracter que no es un numero");
			}
			break;
		}
			
		
	}
}
