package hilos;
public class Hilos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo1 G=new Hilo1();
		Hilo2 E=new Hilo2();
		Hilo3 ER=new Hilo3();
		Hilo4 K=new Hilo4();
		//PRIMER HILO
		G.start();
		try {
			G.sleep(250);
		} catch (InterruptedException e) {System.out.println("error en el primer hilo");}	
		//SEGUNDO HILO
		E.start();
		try {
			E.sleep(250);
		} catch (InterruptedException e) {	System.out.println("error en el segundo hilo");}
		//TERCER HILO
		ER.start();
		try {
			ER.sleep(250);
		} catch (InterruptedException e) {	System.out.println("error en el tercer hilo");}
		//CUARTO HILO
		K.start();
		try {
			K.sleep(250);
		} catch (InterruptedException e) {System.out.println("error en el cuarto hilo");}	
	}
}

class Hilo1 extends Thread{
	public void run(){
		for (int i = 0; i <2; i++){
			System.out.println("G");
			try {
				Hilo1.sleep(1000); 
			//es decir cuando "i"=1 pasará un segundo cuando "i"=2 pasará otro segundo
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hilo2 extends Thread{
	public void run(){
		for (int i = 0; i <2; i++) {
			System.out.println("E");
			try {
				Hilo2.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hilo3 extends Thread{
	public void run(){
		for (int i = 0; i <2; i++) {
			System.out.println("E");
			try {
				Hilo3.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hilo4 extends Thread{
	public void run(){
		for (int i = 0; i <2; i++) {
			System.out.println("K");
			try {
				Hilo4.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
