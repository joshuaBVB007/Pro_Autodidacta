package hilos;

public class PruebaHilos{
	
	public static void main(String[] args) {
		H hilo=new H();
		Thread hilo2=new Thread(new J());
		
		hilo.start();
		try {
			hilo.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("la aplicacion se ha interrumpido en el hilo1! ");
		}
		hilo2.start();
		try {
			hilo2.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("aplicacion interrumpida en el hilo 2! ");
		}
		
	}
}
class H extends Thread{
	public void run(){
		for (int i = 0; i <5; i++) {
			System.out.println("soy Hilo1 ");
		}
	}
}
class J implements Runnable{
	public void run(){
		for (int i = 0; i <5; i++) {
			System.out.println("soy Hilo2 ");
		}
	}
}