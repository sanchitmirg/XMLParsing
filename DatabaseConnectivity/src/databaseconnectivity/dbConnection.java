package databaseconnectivity;

import java.sql.*;
import java.math.*;

public class dbConnection {
	
	Connection conn;
	Statement stmt;
	String sql;
	String user_name;
	String pass_word;
	
	//get the database connection 
	public void getDatabaseConnection(){
		try{
		conn =DriverManager.getConnection("jdbc:sqlanywhere:DSN=ips");
		stmt = conn.createStatement();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	 
	public void queryExecution(String query, String userName, String password){
		
		try{
			ResultSet rs = stmt.executeQuery(query);
		
			while(rs.next()){
				
				this.user_name = rs.getString("user_name");
				//System.out.println(this.user_name);
				
				this.pass_word = rs.getString("user_password");
				//System.out.println(this.pass_word);
				
				if(this.user_name.equals(userName) && this.pass_word.equals(password)){
					
					System.out.println("Successful Login...");
					
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
