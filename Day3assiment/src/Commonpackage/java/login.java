package Commonpackage.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login {
	
	static final String URL="jdbc:mysql://localhost:3306/tweetapp";
	static final String USER="root";
	static final String PASSWORD="root";
	static final String QUERY="select * from  registration where email=? AND password=?;";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);	
				Statement stmt= con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);){
			
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter email name");
			String email=sc.nextLine();
			System.out.println("enter password");
			String password=sc.nextLine();
			
			ps.setString(1,email);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
		
			if(rs.next()) {

				System.out.println("user login successfully");
			
			}
		else {
			System.out.println("user name or password is incorrect");
			}
		}catch(SQLException e) {
			
			System.out.println("user name or password is incorrect");
		}
		

	}

}
