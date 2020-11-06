import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class JDBCPlayer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Player","root","root");  
		
	    System.out.println("connection established");
	    
	    Statement smt = con.createStatement();
	    //create stament
	    
	
	    
	    String q1= "select *from players";
	    
	    ResultSet r= smt.executeQuery(q1);
	    
		ArrayList<players> al = new ArrayList<>();
		
		while(r.next())
		{
			players obj = new  players(r.getString(1),r.getInt(2),r.getInt(3),r.getString(4));
			al.add(obj);
			
			System.out.println(r.getString(1)+" "+r.getInt(2)+" "+r.getInt(3)+" "+r.getString(4));
				
			
		}

      System.out.println("data from array list");
	    
		for(players obj :al)
		{
		
			System.out.println(obj);
		}
		
	    
	    
	    
	    

	}

}
