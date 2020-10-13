package home;

public class Solution {
	
	
	
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
            reversewords("hello how are you");
	}

	private static String reversewords(String s) {
		// TODO Auto-generated method stub
		int i= s.length()-1;
		String ans =" ";
		while(i>=0)
		{
			while(i>=0 && s.charAt(i)== ' ')i--;
			{
				int j=i;
				while(i>=0 && s.charAt(i)!=' ')i--;
				if(ans.isEmpty())
				{
				ans.concat(s.substring(i+1,j+1));
				}
				else
				{
					ans.concat(s.substring(i+1,j+1));
				}
				
				
			}
			
		
				
		}
		return ans;
		
		
		
		
	}
	public static  void main1(String[] args) {
		// TODO Auto-generated method stub
		
            r("hello how are you");
	}
	public static void r(String str) {
        String []array = str.split(" ");
        for(int i=array.length-1; i>=0; i--) {
            System.out.print(array[i]+" ");
        }
    }

	}


