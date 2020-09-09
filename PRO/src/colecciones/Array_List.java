package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> cars =new ArrayList<String>();
		
		while(true){
			Scanner entrada=new Scanner(System.in);
			System.out.println("Que quieres hacer? A=agregar E=eliminar S=sustituir L=leer Lista  x=terminar");
			String e=entrada.nextLine();
			
			if(e.equalsIgnoreCase("A")){
				Scanner carro=new Scanner(System.in);
				System.out.println("introduce el nombre de un coche! ");
				String carro_a_introducir=carro.nextLine();
				cars.add(carro_a_introducir);
			}else if(e.equalsIgnoreCase("L")){
				for(String g:cars){
					System.out.println(g);
				}
			}else if(e.equalsIgnoreCase("E")){
				Scanner eliminar=new Scanner(System.in);
				System.out.println("introduce el numero de la posicion del coche! NOTA:introducir un entero");
				int decision=eliminar.nextInt();
				cars.remove(decision);
			}else if(e.equalsIgnoreCase("S")){
				int posicion;
				while(true){
					try {
						Scanner os=new Scanner(System.in);
						System.out.println("introduce la posicion a remover");
						posicion = os.nextInt();
						
						if(posicion<cars.size()){
							break;
						}
					} catch (Exception e1) {
						System.out.println("Has introducido un indice incorrecto");
					}
				}
				Scanner novo=new Scanner(System.in);
				System.out.println("introduce el nombre del coche");
				String novo_carro=novo.nextLine();
				cars.set(posicion, novo_carro);
			}else if(e.equalsIgnoreCase("T")){
				System.out.println("Hemos Terminado! ");
				break;
			}	
		}
	}
}
