package poo;
public class Interfaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato misifu=new Gato("misifu");
		misifu.clink_clink(true);
	}
}
class Gato implements SonidosGato{
	private String nom;
	public Gato(String nom){
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	@Override
	public void clink_clink(boolean s) {
		// TODO Auto-generated method stub
		if(s==true){
			System.out.println("click clink");
		}else{
			System.out.println("null");
		}
	}
}