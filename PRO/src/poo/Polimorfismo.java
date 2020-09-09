package poo;

public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Felino lista_animales[]=new Felino[2];
		lista_animales[0]=new Leon("Dylan",12);
		lista_animales[1]=new Tigre("Wey",12);

		for(Felino e:lista_animales){
			e.dime_nombre();
		}

	}

}
class Felino{
	private String nombre;
	private int edad;
	public Felino(String nombre,int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	public void dime_nombre(){
		System.out.println(nombre);
	}
}
class Leon extends Felino{
	public Leon(String nom,int edad){
		super(nom,edad);
	}
}
class Tigre extends Felino{
	public Tigre(String nom,int edad){
		super(nom,edad);
	}
}
