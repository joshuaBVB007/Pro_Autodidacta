package hilos;

public class Bucle_Hilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			//System.out.println(i);
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Hilo Interrumpido");
			}
		}
		

	}

}
