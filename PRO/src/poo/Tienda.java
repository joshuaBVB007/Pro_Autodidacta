package poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tienda {
	
	//PROGRAMA PRINCIPAL
	static BufferedReader reader;
	public static void main(String[] args) throws IOException{
		reader = new BufferedReader(new InputStreamReader(System.in));
		int operacio=0;	
		while(operacio!=5){
			System.out.println("---VERDURES AUSTRIA ----");
			System.out.println("1) Afegir cua ");
			System.out.println("2) Quanta gent hi ha ");
			System.out.println("3) LListar cua");
			System.out.println("4) Següent");
			System.out.println("5) Sortir");
			String linia = reader.readLine();
		
		
		switch(linia){
		case "1":
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce dni cliente: ");
			String DNI=bf.readLine();
			System.out.println("Introduce el nombre cliente: ");
			String Nombre=bf.readLine();
			System.out.println("Introduce la direccion: ");
			String direccion=bf.readLine();
			Client receptor=Client.crearCliente(new Client(DNI,Nombre,direccion));
			Client.agregarCliente(receptor);
			System.out.println("Cliente creado exitosamente! ");
			break;
		case "2":
			Client.DimeLongitudCola();
			break;
		case "3":
			Client.ListarClientesCola();
			break;
		case "4":
			Client.PasarSiguienteCliente();
			break;
		default:
			operacio=5;
			System.out.println("Adeu, bon dia tingui!");
		}
		
	}
		
		
		
		
		
	}	
}


class Client{
	private String dni;
	private String nom;
	private String direccio;
	public static ArrayList <Client> cua=new ArrayList <Client>();
	public Client(String dni, String nom, String direccio) {
		this.dni = dni;
		this.nom = nom;
		this.direccio = direccio;
	}
	
	//METODOS DE OBJETOS DE LA CLASE
	//DNI
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	//NOM
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//DIRECCION
	public String getDireccio() {
		return direccio;
	}
	public void setDireccio(String direccio) {
		this.direccio = direccio;
	}

	
	//METODOS DE LA CLASE
	public static void agregarCliente(Client e){
		cua.add(e);
	}
 
	public static Client crearCliente(Client e){
		return e;
	}
	
	public static void DimeLongitudCola(){
		System.out.println(cua.size());
	}
	
	public static void ListarClientesCola(){
		if(cua.size()==0){
			System.out.println("No hay clientes en cola!");
		}else{
			for (Client e : cua) {
				System.out.println("El cliente: "+e.getNom()+" con DNI: "+e.getDni());
			}
		}	
	}
	
	public static void PasarSiguienteCliente(){
		if(cua.size()==0){
			System.out.println("no hay clientes en la cola");
		}else if(cua.size()==1){
			System.out.println("atendiendo ahora mismo a: "+cua.get(0).getNom());
			System.out.println("y no mas clientes en fila");
			cua.remove(0);
		}else if(cua.size()>1){
			System.out.println("atendiendo ahora mismo a: "+cua.get(0).getNom());
			System.out.println("el siguiente cliente es: "+cua.get(1).getNom());
			cua.remove(0);
		}		
	}	
		
		
	
	

	
	
}






