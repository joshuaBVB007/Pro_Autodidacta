package poo;

public class Crear_Clases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato Donald=new Pato("Donald");
		
		
	}

}

class Pato{
	private String nombre;
	public String getNombre() {//Getter
		return nombre;
	}
	public void setNombre(String nombre) {//setter
		this.nombre = nombre;
	}
	public int getPatas() {//Getter
		return patas;
	}
	private final int patas;
	public Pato(String nombre){
		this.nombre=nombre;
		patas=2;
	}
}
