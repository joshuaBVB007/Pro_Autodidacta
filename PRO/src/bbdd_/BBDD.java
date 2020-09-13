package bbdd_;

import java.sql.*;
public class BBDD {
	public static void main(String[] args) {
		
		try {
			//Creamos conexion
			Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useSSL=false","root", "jaKsVaFa");
			//creamos el statement 
			Statement mistatement=miconexion.createStatement();
			//creamos el resulset
			ResultSet miresultset=mistatement.executeQuery("select * from country");
			//recorremos el resulset
			while(miresultset.next()){
				System.out.println(miresultset.getString("name"));
			}
			
		} catch (SQLException e) {
			System.out.println("Lo siento jonathan!");
			e.printStackTrace();
		}	
	}
}
