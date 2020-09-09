package strings;

public class ConversionTiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String --> int
		int a=Integer.parseInt("4");
		int b=Integer.valueOf("2");
		System.out.println(a+b);
		
		//int to String
		String c=Integer.toString(5); //el metodo toString de la clase Integer devuelve un entero del valor pasado
		String d=String.valueOf(4);  //el metodo valueOf de la clase string devuelve un string de los datos pasados
		System.out.println(c+d);
		
		//char to String
		String e=Character.toString('r');
		String f=String.valueOf('t');
		
		//String to char
		String toma="jonathan";
		char tomado[]=toma.toCharArray();
		
		String paso="jonathan";
		char real=paso.charAt(4);
		
	}
}
