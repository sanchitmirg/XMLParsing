package login;
import databaseconnectivity.*;
import java.util.Scanner;

public class CheckLogin {
	
	dbConnection getConnection;
	Scanner sc;
	String userName;
	String password;
	String query;
	
	public void go(){
		
		getConnection = new dbConnection();
		getConnection.getDatabaseConnection();
		
		sc = new Scanner(System.in);
	}
	
	public void getInput(){
		
		System.out.println("Enter Your UserName:");
		this.userName = sc.next();
		System.out.println("Enter Your Password:");
		this.password = sc.next();
		
		this.verify(this.userName, this.password);
	}
	
	public void verify(String userName, String password){
		
		query = "Select user_name,user_password from security_users";
		
		getConnection.queryExecution(query, userName, password);
	}
	
	public static void main(String[] args) {
		
		CheckLogin login = new CheckLogin();
		login.go();
		login.getInput();

	}

}
