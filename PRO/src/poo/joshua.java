package poo;

import java.util.HashSet;
import java.util.Set;

public class joshua {
	public static void main(String[] args) {
		Apostador Apost1=new Apostador("ssss",12,0);
		/*Apostador Apost2=new Apostador("ssss",12,0);
		Apostador Apost3=new Apostador("ssss",12,0);
		Apostador Apost4=new Apostador("ssss",12,0);*/
		
		Apostador.DameListaApuestas();
	}
}

class Apostador{
	static Set <Apostador> e=new HashSet <Apostador>();
	private String DNI;
	private int Local;
	private int Visit;
	
	public Apostador(String DNI,int L,int V){
		this.DNI=DNI;
		this.Local=L;
		this.Visit=V;
		Apostador et=crearApostador(new Apostador(DNI,Local,Visit));
		Apostador.Agregar(et);
		
	}
	
	public static Apostador crearApostador(Apostador es){	
		return es;
	}
	
	public static void Agregar(Apostador este){
		e.add(este);
	}
	
	public static void AgregarApuesta(Apostador a){
		for (Apostador it: e) {
			if(it.equals(a)){
				e.add(a);
			}else{
				System.out.println("DNI iguales rechazada la apuesta");
			}
		}
	}
	
	public static void DameListaApuestas(){
		for (Apostador i: e) {
			System.out.println(i);
		}
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
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
		return true;
	}

}