package strings;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre completo: ");
		String entrada2=entrada.nextLine();
		
		char [] lista_nombre=entrada2.toCharArray();	//llenamos el array lista
		String [] lista_String1=new String[lista_nombre.length];
		
		//conversion char--> String
		for(int i=0;i<lista_nombre.length;i++){
			String receptor=Character.toString(lista_nombre[i]);	//pasamos de char a String
			lista_String1[i]=receptor;
		}
		for(int i=0;i<lista_String1.length;i++){
			if(lista_String1[i].equals(" ")){
				System.out.print(" "+lista_String1[i+1].toUpperCase());
				i++;//le sumo 1 para que no me de el caracter repetido 2 veces uno en mayus y otro minus
			}else if(i<1){
				System.out.print(lista_String1[i].toUpperCase());
			}else{
				System.out.print(lista_String1[i]);
			}
		}
		
		
		
	}

}
