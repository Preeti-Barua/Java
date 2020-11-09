package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Personjdbc {
	
	public static Connection getconnection() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Person","root","root");  
       System.out.println("connection got");
		return con;
		
	}
	
	public static void insert() throws ClassNotFoundException, SQLException
	{
		Connection con= getconnection();
		String query= "insert into Person values(?,?,?,?)";
		PreparedStatement pmt= con. prepareStatement(query);
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter id");
		int id=s.nextInt();
		System.out.println("enter email");
		String email=s.next();
		System.out.println("enter gender(M/F)");
		String gender=s.next();
		
		
		pmt.setString(1,name);
		pmt.setInt(2, id);
		pmt.setString(3, email);
        pmt.setString(4, gender);
        
        
        int n= pmt.executeUpdate();
        		System.out.println(n+ "record inserted");
		
		
		
	}
	
	public static void display() throws ClassNotFoundException, SQLException
	{
		Connection con= getconnection();
		
		String  query1 = "select * from Person ";
		 PreparedStatement pmt1 =con.prepareStatement(query1);
		 
		 ResultSet rs = pmt1.executeQuery();
		 
		 
		 while(rs.next())
		 {
			 System.out.println(rs.getString(1) +rs.getInt(2)+rs.getString(3)+rs.getString(4));
		 }
		
	}
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
    	
    	
    	insert();
    	display();
    }

}
