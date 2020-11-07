package javaAssignment8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcProduct {

	

		
		
		public static Connection getconnection() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Product","root","root");  
	       System.out.println("connection got");
	        return con;
		}
		
		
		
		public static void insertrecord() throws ClassNotFoundException, SQLException
		{
			//insert
			Connection con= getconnection();
			 Scanner s = new Scanner(System.in);
			String query = "insert into Product values(?,?,?,?,?,?)";
			PreparedStatement pmt = con.prepareStatement(query);
				
			
			
			  
			System.out.println("enter id ");

		
			   int  id = s.nextInt();
			   System.out.println("enter name ");
			   String name = s.next();
			   System.out.println("enter catagory ");
			   String catagory = s.next();
			   System.out.println("enter price ");
			   int price = s.nextInt();
			   System.out.println("enter manufacture ");
			   String manu = s.next();
			   
			   System.out.println("enter quantity ");
			   int quantity = s.nextInt();
			   
			   
			   
			   pmt.setInt(1, id);
			   pmt.setString(2, name);
			   pmt.setString(3, catagory);
			   pmt.setInt(4,price);
			   pmt.setString(5,manu);
			   pmt.setInt(6,quantity);
			   
			
			   int nr = pmt.executeUpdate();
			   System.out.println(nr + "record inserted");
			
			
			
	}
		
		public static void manufacture() throws ClassNotFoundException, SQLException
		{
			Connection con= getconnection();
			
			//select
			
			
					//create query
					
				       String query1 =  "select * from Product where manufacture =  ? ";
				       
				     
				    
				       PreparedStatement pmt1 = con.prepareStatement(query1);
				       Scanner s = new Scanner(System.in);
					System.out.println("enter the manufacture name that you want to get details");
					 String sc = s.next();
				  
			     		pmt1.setString(1, sc);
					
					
			     		
			     		//execute the query
			            
			    		ResultSet rs = pmt1.executeQuery();
			    		
			    		while(rs.next())
			    		{		
			    			
			    			System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" " + rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6));
			    				
			    			
			    		}
			

		}
		
		public static void display() throws ClassNotFoundException, SQLException
		{
			Connection con= getconnection();
			
			//select
			
			
					//create query
					
				       String query1 = "select * from product ";
				       
				       Scanner s = new Scanner(System.in);
				    
				       PreparedStatement pmt1 = con.prepareStatement(query1);
				       
				    
				/*	System.out.println("enter empno to retrive the details");
					 int eno = s.nextInt();
				  
			     		pmt1.setInt(1, eno); // replace the ? with eno
			     		*/
					
					
			     		
			     		//execute the query
			            
			    		ResultSet rs = pmt1.executeQuery();
			    		
			    		while(rs.next())
			    		{		
			    			
			    			System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" " + rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6));
		    				
			    			
			    		}
			
		
		}
		
		

		public static void main(String[] args) throws SQLException, ClassNotFoundException 
		{
			
			
			
		//	getconnection();
		//	insertrecord() ;
			manufacture();
			display();
			
			
			
			/*
		   boolean ch = true;
			while(ch)
			{
			
			System.out.println("1. Insert Record");
			System.out.println("2. Update St Record");
			System.out.println("3. Show Student Record");
			System.out.println("4. exit");
			System.out.println("***** Enter Your choice*****");
			

			Scanner sc  = new Scanner(System.in);
			int opt=sc.nextInt();
		
				
				*/
	}
		}

