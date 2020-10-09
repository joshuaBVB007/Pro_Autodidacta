package clase_Eduardo_Lara;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializacion {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Vehicle lista[]=new Vehicle[2];
		lista[0]=new Coche("rojo",2,"Ferrari","f",4,4);
		lista[1]=new Moto("azul",2,"Yamaha","G",2200,"buenisima");	
		
		
		try {
			FileOutputStream file=new FileOutputStream("/home/cf19jonathan.ascencio/Escriptori/jonathan.txt");
			ObjectOutputStream file2=new ObjectOutputStream(file);
			file2.writeObject(lista);
			file2.close();
			System.out.println("Objeto escrito en el fichero con exito");
			
			ObjectInputStream e=new ObjectInputStream(new FileInputStream("/home/cf19jonathan.ascencio/Escriptori/jonathan.txt"));
			Vehicle [] lista_nueva=(Vehicle[]) e.readObject();
			e.close();
			for (Vehicle vehicle : lista_nueva) {
				System.out.println(vehicle);
			}
		} catch (Exception e1) {
			System.out.println("el fichero ha sido movido de sitio o renombrado");
		}
		
		
	}
}

abstract class Vehicle implements Serializable{
	String Color;
	private int Caballos;
	private String Marca;
	private String Modelo;
	public Vehicle(){
		Color="";
		Caballos=0;
		Marca="";
		Modelo="";
	}	
	public Vehicle(String Color,int Caballos,String Marca,String Modelo) {
		this.Color=Color;
		this.Caballos=Caballos;
		this.Marca=Marca;
		this.Modelo=Modelo;
	}
	@Override
	public String toString() {
		return "Vehicle [Color=" + Color + ", Caballos=" + Caballos + ", Marca=" + Marca + ", Modelo=" + Modelo + "]";
	}	
}
class Coche extends Vehicle{
	private int numPuertas;
	private int capacidadMaletero;
	public Coche(int numPuertas,int capacidadMaletero) {
		super();
		this.numPuertas = numPuertas;
		this.capacidadMaletero = capacidadMaletero;
	}
	public Coche(String Color, int Caballos, String Marca, String Modelo,int numPuertas,int capacidadMaletero) {
		super(Color, Caballos, Marca, Modelo);
		this.numPuertas = numPuertas;
		this.capacidadMaletero = capacidadMaletero;	
	}
	
	public String toString(){
		return super.toString()+"[el numero de puertas es: "+numPuertas+" la capacidad de maletero es:"+
				capacidadMaletero+"]";	
	}
	
}
class Moto extends Vehicle{
	private int precio;
	private String descripcion;
	public Moto(int precio,String descripcion) {
		super();
		this.precio=precio;
		this.descripcion=descripcion;
	}
	public Moto(String Color, int Caballos, String Marca, String Modelo,int precio,String descripcion) {
		super(Color, Caballos, Marca, Modelo);
		this.precio=precio;
		this.descripcion=descripcion;
	}
	@Override
	public String toString() {
		return super.toString()+"Moto [precio=" + precio + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
