package clase_Eduardo_Lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
	static File e=null;
	static PrintWriter print=null; 
	public static void iniciar(){
		e=new File("C:\\Users\\Usuario\\Desktop\\ficherito.txt");
		try {
			print=new PrintWriter(e);
		} catch (FileNotFoundException e1) {
			System.out.println("fichero no encontrado! ");
		}
	}
	
	static ArrayList<Empleado> lista=new ArrayList<Empleado>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		iniciar();
		while(true){
			System.out.println("Que quieres hacer\n1-crear empleado\n2-Listar empleados\n3-Guardar Cambios\n4-limpiar Regsitros\n5-Finalizar");
			Scanner e=new Scanner(System.in);
			int decision=e.nextInt();
			if(decision==1){
				BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
				try {
					System.out.println("Introduce un Apellido: ");
					String Apellido=bf.readLine();
					System.out.println("Introduce un Departamento: ");
					String Depart=bf.readLine();
					int Departamento=Integer.parseInt(Depart);
					System.out.println("Introduce un Salario: ");
					String Salario=bf.readLine();
					int sal=Integer.parseInt(Salario);
					int id=Empleado.Asignarid();
					Empleado.crearEmpleado(new Empleado(id,Apellido,Departamento,sal));
				} catch (Exception e1) {
					System.out.println("Algo ha fallado! ");
				}
			}else if(decision==2){
				Empleado.listaEmpleados();
			}else if(decision==3){
				print.close();
				System.out.println("Se han guardado los cambios");
			}else if(decision>4 || decision<1){
				System.out.println("Hemos Terminado!");
				break;
			}else if(decision==4){
				iniciar();
				lista.clear();
				print.close();
				System.out.println("Se ha limpiado los registros");
			}
		}
	}
}
class Empleado extends Registro{
	private String Apellido;
	private int Departamento;
	private double Salario;
	private static int idnext=0;
	private int id=idnext;
	public Empleado(int id,String apellido, int departamento, double salario) {
		Apellido = apellido;
		Departamento = departamento;
		Salario = salario;
	}
	
	public static int Asignarid(){
		if(idnext==0){
			idnext++;
			return idnext;
		}else{
			idnext++;
			int receptor=Empleado.devolverid(idnext);
			return receptor;
		}
	}
	
	public static  int devolverid(int t){
		return t;
	}
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", Apellido=" + Apellido
				+ ", Departamento=" + Departamento + ", Salario=" + Salario
				+ "]";
	}

	static void crearEmpleado(Empleado e){
		lista.add(e);
		print.println(e);
		System.out.println("empleado creado con exito");
	}
	
	static void listaEmpleados(){
		for (Empleado i : lista) {
			System.out.println(i);
		}
	}
	
	
	
}
