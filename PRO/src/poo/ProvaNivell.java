package poo;
import java.util.ArrayList;

public class ProvaNivell {
	public static void main(String[] args) { 
		/*respuesta 10
		 * todo elemento de la subclase sera siempre un elemento de la superclase
		 * un coche sera siempre un Vehiculo ver ejemplo abajo
		 */
		Coche p=new Coche("ssss",122,(float) 3.4,null);
		Coche s=new Coche("ssssss",120,(float)447.5,new Pilot("Mauricio"));
		Vehicle t=new Coche("ssssddd",45,(float)200.5,new Pilot("Josefina"));
		Vehicle z=new Vehicle();
		
		//POLIMORFISMO ELEMPLO.
		t.InstanciaDeClase();
		z.InstanciaDeClase();
		t.validadorAntiguedad(t.getAntiguedad());
		t.ValidarLongitudMatricula();
		s.setMatricula();
		System.out.println(s.getP().getNom());
		s.DesasignarPiloto();
		System.out.println(s.getP());
		
		Coche.dimeUtilitarioViejo();
				
	}
}

class Vehicle{//respuesta 2 del examen(creacion clase y 2 propiedades)
	public String Matricula;
	public int Antiguedad;
	
	//respuesta 3 del examen
	public Vehicle(){//sobrecarga de constructores
		/*pude no haberlo escrito para que usase el constructor por defecto
		pero para este ejemplo lo hice asi*/
	}
	public Vehicle(String Matricula,int Antiguedad){//Constructor
		this.Matricula=Matricula;
		this.Antiguedad=Antiguedad;
	}
	
	//respuesta 4 del examen
	public String getMatricula() {//GETTER
		return Matricula;
	}
	public void setMatricula(String matricula) {//SETTER
		Matricula = matricula;
	}
	public int getAntiguedad() {//GETTER
		return Antiguedad;
	}
	public void setAntiguedad(int antiguedad) {//SETTER
		Antiguedad = antiguedad;
	}
	
	//Respuesta 4 del examen
	public void ValidarLongitudMatricula(){
		String receptor=this.Matricula;
		int ValidadorAntiguedad=this.Antiguedad;
		char [] lista=receptor.toCharArray();
		if(lista.length>5 && lista.length<10){
			System.out.println("Longitud Matricula Valida! ");
		}else{
			System.out.println("Longitud Matricula No Valida");
		}
		
	}
	
	public void validadorAntiguedad(int i){
		if(this.Antiguedad>120){
			System.out.println("Coche con antiguedad aun permitida");
		}else{
			System.out.println("Coche con antiguedad no permitida");
		}
	}
	
	public void InstanciaDeClase(){
		System.out.println("soy vehiculo");
	}
	
	
}


class Coche extends Vehicle{ 
	//con la palabra reser.HERENCIA podemos hcer usos de los metodos y propiedades de la superclase
	private static ArrayList <Integer> g=new ArrayList <Integer>();
	private float VelMax;
	private Pilot p;
	public Coche(String Matricula,int Antiguedad,float VelMax,Pilot p){//CONSTRUCTOR
		super(Matricula,Antiguedad);
		this.VelMax=VelMax;
		AsignarPiloto(p);
		Coche.anadirDatos(this.Antiguedad);
		
	}
	/* respuesta 8: como se podra ver arriba me he creado una propiedad
	 * piloto para agregarselo a cada coche en caso de que no 
	 * queramos añadir piloto
	 * a un coche le ponemos null
	 */
	
	
	public Pilot DesasignarPiloto() { //respuesta 9 parte1
		System.out.println("Piloto removido");
		Pilot resolucion=this.p=null;
		return resolucion;
	}

	public void AsignarPiloto(Pilot p) {//respuesta 9 parte 2
		this.p = p;
	}
	
	/*métodos de la propiedades piloto el setter me lo he evitado por que 
	asignarPiloto cumple la misma funcion*/
	public Pilot getP() {
		return this.p;
	}

	//respuesta 5 
	public float getVelMax() {//GETTER
		return VelMax;
	}
	public void setVelMax(float velMax) {//SETTER
		VelMax = velMax;
	}
	
	public  void ValidarVelocidadMaxima(){
		if(this.VelMax>447){
			System.out.println("Velocidad con riesgo de accidente");
		}else{
			System.out.println("Velocidad sin riesgo");
		}
	}
	
	
	//respuesta 6
	public void setMatricula() {//Valida si empieza por letra o no
		String NuevaMatricula=this.Matricula;
		float NuevaVelmax=this.VelMax;
		char[]listita=NuevaMatricula.toCharArray();
		String [] letras={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for (int i = 0; i < 1; i++) {
			String rest=Character.toString(listita[0]);
			Coche.IsNumeric(rest,NuevaVelmax);
		}	
	}
	
	public static void IsNumeric(String numero,float V){
		try {  
		    Integer.parseInt(numero);  
		    System.out.println("Matricula No Valida(Empieza con numero) "+" con velocidad maxima "+V);;
		  } catch(NumberFormatException e){  
		    System.out.println("Matricula Valida empieza con una letra"+" con velocidad maxima "+V);  
		  } 
	}
	
	public static void anadirDatos(int s){
		g.add(s);
	}
	
	//respuesta 7
	public static void dimeUtilitarioViejo(){
		int i;
		int Comparador=g.get(0);
		for (i = 0; i < g.size(); i++) {
			if(Comparador<=g.get(i)){
				Comparador=g.get(i);
			}
		}
		System.out.println("El utilitario mas viejo tiene "+Comparador+" años");
	}
	
	public void InstanciaDeClase(){
		System.out.println("soy coche");
	}
	
	
	
}

class Pilot{
	private String nom;
	public Pilot(String nom){
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}




