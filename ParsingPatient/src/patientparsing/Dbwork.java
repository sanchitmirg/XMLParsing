package patientparsing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbwork {

	Dbwork(){
		
		try{
			
			Connection conn =DriverManager.getConnection("jdbc:sqlanywhere:DSN=ips");
			Statement stmt = conn.createStatement();
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
}
