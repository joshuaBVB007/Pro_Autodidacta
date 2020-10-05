package provasNivell;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Apuestas_ {
	public static void main(String[] args) {
		
		
		
		
		
		
		
		Apostador.crearRonda();
		Apostador.ListarApostadores();
		Apostador.anunciarGanador();
		
		
	}
}

class Apostador{
	static Set <Apostador> lista=new HashSet <Apostador>();
	static ArrayList <Apostador> lista_Absoluta=new ArrayList <Apostador>(); 
	private String DNI;
	private int Local;
	private int Visit;
	
	public Apostador(String DNI,int L,int V){
		this.DNI=DNI;
		this.Local=L;
		this.Visit=V;
	}
	
	public static  void crearRonda(){
		Apostador e=new Apostador("12234",1,2);
		Apostador w=new Apostador("12235",1,1);
		Apostador x=new Apostador("12236",1,0);
		Apostador d=new Apostador("12237",0,0);
		lista.add(e);
		lista.add(w);
		lista.add(x);
		lista.add(d);
	}

	
	public static void ListarApostadores(){
		System.out.println("la apuestas validas son");
		for (Apostador e : lista) {
			System.out.println(e.DNI);
			lista_Absoluta.add(e);
		}
		System.out.println("FIN");
	}
	
	public static void anunciarGanador(){
		int [] apuesta=new int[2];
		for (int i = 0; i < apuesta.length; i++) {
			apuesta[i]=(int)(Math.random()*2);
			
		}
		Apostador.crearDEF(apuesta[0],apuesta[1]);
	}
	
	public static void crearDEF(int apuesta, int apuesta2){
		System.out.println("El clasico terminó: "+apuesta+"-"+apuesta2);
		for (Apostador it : lista_Absoluta) {
			//System.out.println(it.Local+"-"+it.Visit); muestra todas las apuestas de los clientes
			if(it.Local==apuesta){
				if(it.Visit==apuesta2){
					System.out.println("el ganador es:"+it.DNI+" que pronosticó "+it.Local+"-"+it.Visit);
				}
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + Local;
		result = prime * result + Visit;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apostador other = (Apostador) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (Local != other.Local)
			return false;
		if (Visit != other.Visit)
			return false;
		return true;
	}
		
}