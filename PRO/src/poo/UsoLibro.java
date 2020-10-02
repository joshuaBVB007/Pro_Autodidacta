package poo;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro e=new Libro("Mi vida","Miguel",1234);
		Libro et=new Libro("Mi vida","Miguel",1239);
		Libro este=new Libro("mi vida","Miguel",1239);
		
		if(et.equals(este)){
			System.out.println("son el mismo libro");
		}else{
			System.out.println("no son el mismo libro");
		}
			
	}
}

class Libro{
	private String Nombre;
	private String Autor;
	private int ISBN;
	
	public Libro(String nombre, String autor, int iSBN){
		Nombre = nombre;
		Autor = autor;
		ISBN = iSBN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
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
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}

}


