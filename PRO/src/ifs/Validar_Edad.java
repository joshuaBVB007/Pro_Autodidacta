package ifs;

import java.util.Scanner;

public class Validar_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("Introduce una edad! ");
			Scanner sc=new Scanner(System.in);
			int edad=sc.nextInt();
			
			if(edad<18 && edad>0){
				System.out.println("Eres un niño aun! ");
			}else if(edad>=18){
				System.out.println("Eres un adulto! ");
			}else if(edad==0){
				System.out.println("Hemos Terminado! ");
				break;
			}
		}
	}

}
