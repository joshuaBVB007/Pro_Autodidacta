package bbdd_;

import java.sql.*;


public class BBDD2 {
	public static void main(String[] args) {

		
		try {
			//crear conexion
			Connection e=DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useSSL=false","root","jaKsVaFa");
			//crear Statement
			Statement i=e.createStatement();
			//crear Resulset
			ResultSet r=i.executeQuery("select * from country");
			
			while(r.next()){
				System.out.println(r.getString("name"));
			}
			
		} catch (SQLException e) {
			System.out.println("No hemos podido conectar con la base dde datos");
		}
		
		
		
		
		
	}
}
