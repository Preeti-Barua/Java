
package javaAssignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/* 1) Write a Java menu driven program to perform the following operations-using Array List 
       Create a class called Player with the following instance variable 
          

Player name 
total run 
no of wicket 
no of matches 
country 
no-of-century 
Category = null 

* Create 5 Players  add into the Array List 
* Display the player details who has scored maximum no of runs 
* Sort the players by name 
* Remove the player who has scored less than 100 runs and played more than 3 matches. 
*/

class Player
{
	   @Override
	public String toString() {
		return  Playername+" "  + totalruns +" "+ noofwickets ;
	}

	String Playername;
	    int totalruns;
	   int noofwickets;
	   
	   
	   
	   
	   Player(String Playername,int totalruns, int noofwickets)
	   {
		   this.Playername=Playername;
		   this.totalruns=totalruns;
		   this.noofwickets=noofwickets;
		 
				   
		   
	   }
	   
	   void Display()
	   {

		   System.out.println(Playername+totalruns+noofwickets);
		
		 
		   
	   }
	   
	 
	   }
	   


	
	 	  
	 	  
	   
	 
	   
	  

class AlistPlayer
{

	static void Addplayer(ArrayList<Player>al)
	 {
		 
		      Player p= new Player("Dhoni",2300,2);
		      Player p1= new Player("pant",2000,1);
		      Player p2= new Player("jadeja",400,3);
		      Player p3= new Player("Rohit",2310,4);
		      Player p4= new Player("yuzi",1000,5);
		      
		       al.add(p);
		       al.add(p1);
		       al.add(p2);
		       al.add(p3);
		       al.add(p4);
		       
		       
		 
		 	  
		 

	 } 
	
	static void removeplayer(ArrayList<Player>al)
	{
		
		System.out.println("-------------------------------------------------------------------------");
		ArrayList<Player> al1= new ArrayList<Player>();
		for(Player px: al)
		{
			if(px.totalruns<2000)
			{
				al1.add(px);
			}
		}
		al.removeAll(al1);
		
		for(Player a:al)
		{
		System.out.println(a);
		}
		
		System.out.println("----------------------------------------------------------------------------");
	}




static void sortplayerbyscore(ArrayList<Player>al)
{
	SortByscore s= new SortByscore();
	Collections.sort(al,s);
}

static  void Sortnameofplayers(ArrayList<Player>al)
{
	Sortbyname s=new Sortbyname();
	Collections.sort(al,s);
			
}




public static void displayplayer(ArrayList<Player> al) {
	// TODO Auto-generated method stub
	
	
	      for( Player a:al)
	      {
	    	  System.out.println(a);
	    	 
	    	  
	      }
}

public static void update(ArrayList<Player>al)

{
	        Scanner s= new Scanner(System.in);
	        int no= s.nextInt();
	        
	       for(Player o:al)
	       {
	    	   if(o.noofwickets==no)
	    	   {
	    		   o.Playername="vpor";
	    	   }
	       }
	        

}








}

public class CricketPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <Player> al= new ArrayList<Player>();
		System.out.println("adding 5 players into ArrayList:");
		AlistPlayer.Addplayer(al);
		AlistPlayer.displayplayer(al);
        System.out.println();
        System.out.println();
        
		System.out.println("sorted by names");
		AlistPlayer.Sortnameofplayers(al);
		AlistPlayer.displayplayer(al);
		 System.out.println();
		 System.out.println();
        
    	System.out.println("update the value ");
		AlistPlayer.update(al);
		AlistPlayer.displayplayer(al);
		
		
		System.out.println("Players who have maximum no of runs: ");
		AlistPlayer.sortplayerbyscore(al);
		AlistPlayer.displayplayer(al);
		System.out.println("after removing player who have less runs");
		AlistPlayer.removeplayer(al);
		
		 System.out.println();
		 System.out.println();
		

		
		
		
		
		
		
		
	}



}
class SortByscore implements Comparator<Player>
{
	


	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		
		if(o1.totalruns < o2.totalruns)
		{
			return 1;
			
		}
		else
		{
			return -1;
		}
	
	}



}



class Sortbyname implements Comparator <Player>
{
	


	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return  o1.Playername.compareTo(o2.Playername);
		
	}
}
