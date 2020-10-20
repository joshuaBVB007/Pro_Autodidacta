package bbdd_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class post_greSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/bdroot";
			Connection conn=DriverManager.getConnection(url,"root","joan");
			Statement stmt=conn.createStatement();
			String queryString="select  nombre from casas";
			ResultSet res=stmt.executeQuery(queryString);
			
			while(res.next())
				System.out.println("el usuario es: "+res.getObject(1));
				stmt.close();
				conn.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("sorry");
		}
		
		
	}

}
