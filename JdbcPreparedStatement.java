package nov6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcPreparedStatement {

		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{
		
			
			//loading driver class 
					Class.forName("com.mysql.cj.jdbc.Driver"); 
					
					//create connectin
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edacfeb2020","root","root");  

			System.out.println("connection got");
				
			//insert
			
			 Scanner s = new Scanner(System.in);
			String query = "insert into emp values(?,?,?)";
			PreparedStatement pmt = con.prepareStatement(query);
			
			System.out.println("enter empno ");
			
			    int eno = s.nextInt();
			   System.out.println("enter name ");
			   String name = s.next();
			   System.out.println("enter sal ");
			   float sal = s.nextFloat();
			   
			   pmt.setInt(1, eno);
			   pmt.setString(2, name);
			   pmt.setFloat(3, sal);
			
			   int nr = pmt.executeUpdate();
			   System.out.println(nr + "record inserted");
			   
			
			
			
			   /*
			
		//select
			
			
			//create query
			
		       String query1 = "select * from emp where empno =  ? ";
		       
		      
		    
		       PreparedStatement pmt1 = con.prepareStatement(query1);
		    
			System.out.println("enter empno to retrive the details");
			 eno = s.nextInt();
		  
	     		pmt1.setInt(1, eno); // replace the ? with eno
			
			
			
	       //execute the query
	       
			ResultSet rs = pmt1.executeQuery();
			
			while(rs.next())
			{		
				
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" " + rs.getFloat(3));
					
				
			}
			
		
			
			
		// update
			
			
			String query2 = "update emp set sal = sal + ? where empno = ?";
			System.out.println("enter the sal :");
		       sal = s.nextFloat();
			
			
			PreparedStatement pmt2 = con.prepareStatement(query2);
			pmt2.setFloat(1, sal);
			pmt2.setInt(2, eno);
			
			 int nr = pmt2.executeUpdate();
			 
			 System.out.println(nr + " "+ "rows updated");
			 
			 
			 
			 String query3 = "select * from emp where empno =  ? ";
			 
			 PreparedStatement pmt3 = con.prepareStatement(query3);
			 pmt3.setInt(1, eno);
			 
			 
			 ResultSet rs1 = pmt3.executeQuery();
				
				while(rs1.next())
				{		
					
					System.out.println(rs1.getInt(1)+ " "+ rs1.getString(2)+" " + rs1.getFloat(3));
						
					
				}
			 */
			
			 
			//delete
			   
			   String query4 = "delete from emp where empno =?";
				PreparedStatement pmt4 = con.prepareStatement(query4);
				
				System.out.println("enter empno to delete");
				
				    eno = s.nextInt();
				 
				   
				   pmt4.setInt(1, eno);
				   
				
				   nr = pmt4.executeUpdate();
				   System.out.println(nr + "record deleted");
			
		}
		

	}


