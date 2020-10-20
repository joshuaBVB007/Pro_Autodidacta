package clase_Eduardo_Lara;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Aleatorio {
    static String[] apellido = {"Fernandez","Gil","Lopez","Ramos","Sevilla","Casillas","Rey"};
    static int[] departamento = {10,20,10,10,30,30,20};
    static double[] salario={1000.45, 2400.60, 3000.0, 1500.56, 2200.0, 1435.87, 2000.0};

    public static void main(String[] args){
        File file = new File("C:\\Users\\Usuario\\Desktop\\Lamina.txt");
        RandomAccessFile randomFile=null;
        try {
            randomFile = new RandomAccessFile(file,"rw");
            StringBuffer buffer = null;
            for(int i=0;i< apellido.length;i++){
                randomFile.writeInt(i+1);
                //Writes an int to the file as four bytes, high byte first.
                buffer = new StringBuffer(apellido[i]);
                //string buffer recibe un string,charsequence o un entero
                buffer.setLength(10);
                // Sets the length of the character sequence. osea establece la longitud de los nombres
                //pasamos a string porque stringbuffer soporta charsequence y entero
                randomFile.writeChars(buffer.toString());
                //Writes a string to the file as a sequence of characters.//recibe un string como parametro
                randomFile.writeInt(departamento[i]);
                //Writes an int to the file as four bytes, high byte first.
                randomFile.writeDouble(salario[i]);
                
            }
            //PROCESO DE ESCRITURA FINALIZADO
            int posicion=0;//Valor del puntero
            int idEmpleado, departamento;
            double salario;
            char[] apellidoCharSequence = new char[10];// ESTO ES=10 EMPLEADOS
            
            randomFile.seek(posicion);// =a la posicion del puntero que es O ahora mismo.
            
            while(randomFile.getFilePointer()<randomFile.length()){
                randomFile.seek(posicion);
                idEmpleado=randomFile.readInt();
                for(int i=0; i< apellidoCharSequence.length;i++){
                    apellidoCharSequence[i]=randomFile.readChar();
                }
                //
                
                
                //AQUI UNICAMENTE IMPRIMIMOS LOS VALORES 
                String apellidoS = new String(apellidoCharSequence);
                departamento=randomFile.readInt();
                salario=randomFile.readDouble();
                
                
                System.out.println(idEmpleado+" "+apellidoS+" "+departamento+" "+salario);
                posicion=posicion+36;
            }
        }catch(Exception ex){
            System.err.println("Fichero no existe "+ex);
        }finally {
            try{
                randomFile.close();
            }catch(IOException ex){
                System.err.println("No es posible cerrar el fichero "+ex);
            }
        }
    }
}



