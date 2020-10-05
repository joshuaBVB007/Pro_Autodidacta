package poo;

import java.util.ArrayList;

public class Crear_Clases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pato este=new Pato("Donald");
		Pato est=new Pato("Jonathan");
		Pato es=new Pato("Jesus");
		este.agregar();
		est.agregar();
		es.agregar();	
		Pato.ListarPato();
		
		
		
		
		
	}

}

class Pato{
	private String nombre;
	private final int patas;
	private static ArrayList <Pato> lista=new ArrayList<Pato>();
	public Pato(String nombre){
		this.nombre=nombre;
		patas=2;
	}
	public void agregar(){
		Pato receptor=new Pato(this.nombre);
		crearPato(receptor);
	}
	public static void crearPato(Pato e){
		lista.add(e);
	}
	
	public static void ListarPato(){
		for (Pato patos : lista) {
			System.out.println(patos.nombre);
		}
	}
	
	public String getNombre() {//Getter
		return nombre;
	}
	public void setNombre(String nombre) {//setter
		this.nombre = nombre;
	}
	public int getPatas() {//Getter
		return patas;
	}
}
