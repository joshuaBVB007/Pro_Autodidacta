package whiles;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		int i;
		do {
			Scanner e=new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			i=e.nextInt();
		} while (i<10);
		
		System.out.println("Hemos terminado! ");
		
	}
}
