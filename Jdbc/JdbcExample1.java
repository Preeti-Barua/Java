package nov5;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class JdbcExample1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
	
		//loading driver class 
		Class.forName("com.mysql.cj.jdbc.Driver");

		
		//create connectin
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edacfeb2020","root","root");  
		
	    System.out.println("connection got with mysql");
		
	    //create stament
	    
		Statement smt = con.createStatement();
	    
	    //create query
		
       String query = "select * from emp";
     
       //execute the query
       
		ResultSet rs = smt.executeQuery(query);
		
		//iterate the resultset
		
		ArrayList<Emp> al = new ArrayList<>();
		
		while(rs.next())
		{
			Emp obj = new  Emp(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			al.add(obj);
			
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" " + rs.getFloat(3));
				
			
		}
		
      System.out.println("data from array list");
	    
		for(Emp obj :al)
		{
			if(obj.sal>3000)
			System.out.println(obj);
		}
		
		
		
	    rs.close();
		
	} 
	

	

}
