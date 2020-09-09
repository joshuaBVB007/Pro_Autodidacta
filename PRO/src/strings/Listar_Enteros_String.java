package strings;

public class Listar_Enteros_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jonathan="no me caes bien";
		char [] joshua=jonathan.toCharArray();
		String [] receptor=new String[joshua.length];
		for(int i=0;i<jonathan.length();i++){
			String toma=Character.toString(joshua[i]);
			receptor[i]=toma;
		}
		

	}

}
