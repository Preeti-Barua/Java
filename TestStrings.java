package finalassignments;

import java.util.HashMap;
import java.util.Iterator;

public class TestStrings {

	public static void main1(String[] args) {
		
		
		String s= "Hello how are you";
		String result=reverseAltWords(s);
		System.out.println(result.substring(1));

		}

		public static String reverseAltWords(String s) {

		     String[] str=s.split(" ");
		     String r="";
		     for(int i=0;i<str.length;i++) {
		    	 	if(i%2==1)
		    	 	{
		    	 		str[i]=reverse(str[i]);
		    	 	}
		    	 	r=r+" "+str[i];
		     		}
              		return r;
              		}
		public static String reverse(String s)
		{
			String rev="";

			for(int i=s.length()-1;i>=0;i--){
				rev=rev+s.charAt(i);
			}
			return rev;

		}
		
		public static void main(String args[])
		{
			
			
			findduplicateWords("Hello how are you");
		
			
			
		}
	

		private static void findduplicateWords(String str) {
			// TODO Auto-generated method stub
			HashMap<String , Integer> hm= new HashMap<>();
			
			String s[]=str.split(" ");
			
			
			for(String temp :s)
			{
				
				if(hm.get(temp)!=null)
				{
					hm.put(temp,hm.get(temp)+1);
				}
				else {
				hm.put(temp,1);
				
			}
		}
			
			System.out.println(hm);
		
		Iterator<String> temp= hm.keySet().iterator();
		while(temp.hasNext())
		{
			String t= temp.next();
			if(hm.get(t)>1)
			{
				System.out.println("the Word" +temp+ "appear" +hm.get(temp) +"no of times");
			}
		}
}
}




		

