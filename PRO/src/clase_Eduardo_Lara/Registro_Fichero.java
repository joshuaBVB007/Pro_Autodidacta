package clase_Eduardo_Lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Registro_Fichero {
	static File e=null;
	static PrintWriter print=null; 
	
	public static void iniciar(){
		e=new File("C:\\Users\\Usuario\\Desktop\\lamina.txt");
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
			System.out.println("Que quieres hacer\n1-crear empleado\n2-Listar empleados\n3-Guardar Cambios\n4-limpiar Regsitros\n5-Buscar Empleado  por ID\n6-finalizar");
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
			}else if(decision>5 || decision<1){
				System.out.println("Hemos Terminado!");
				break;
			}else if(decision==4){
				iniciar();
				lista.clear();
				print.close();
				System.out.println("Se ha limpiado los registros");
			}else if (decision==5){
				Scanner el=new Scanner(System.in);
				System.out.println("Introuduce el id del empleado a buscar! ");
				int in=el.nextInt();
				Empleado.PosicionEmpleado(in);
			}
		}
	}
}
class Empleado extends Registro_Fichero{
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
	
	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(int departamento) {
		Departamento = departamento;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
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
		return id + " " + Apellido+" "+ Departamento+" "+ Salario;
	}

	static void crearEmpleado(Empleado e){
		lista.add(e);
		print.println(e);
		System.out.println("-------------------------");
		System.out.println("empleado creado con exito");
		System.out.println("NOTA:es necesario guardar cambios");
		System.out.println("-------------------------");
	}
	
	static void listaEmpleados(){
		if(lista.size()==0) {
			System.out.println("No hay depositos ");
		}
		System.out.println("NOMINA EMPLEADOS");
		System.out.println("----------------------");
		for (Empleado i : lista) {
			System.out.println(i);
		}
		System.out.println("----------------------");
	}
	
	static void PosicionEmpleado(int param){
		while(true){
			if(lista.size()==0){
				System.out.println("No hay registros");
				break;
			}else if(lista.size()<param){
				System.out.println("Lo siento ese numero excede la longitud de la lista ");
				break;
			}else if(param==0){
				System.out.println("Nuestra lista empieza desde uno");
				break;
			}else{
				Iterator  <Empleado> it=lista.iterator();
				while (it.hasNext()) {
					Empleado type = (Empleado) it.next();
					if(type.id==param){
						System.out.println(lista.get(param-1).Apellido);
					}
				}
				break;
			}
		}	
	}
	
	
}

