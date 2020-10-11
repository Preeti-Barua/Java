package finalassignments;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DataTest {
	
	
	public static void main(String args[]) throws ParseException
	{
		SimpleDateFormat f= new SimpleDateFormat("yyyy-mm-dd");
		Date joiningDate= f.parse("2020-09-29");
		Date birthDate=f.parse("1997-11-20");
		long d= joiningDate.getTime() - birthDate.getTime();
		long y=(d / (1000l * 60 *60 *24 *365));
		System.out.println("the number of years between joiningDate anf Birthdate is" +y+ "years");
	}
	
	
	
	
	
	public static void main1(String args[]) throws ParseException
	{
		SimpleDateFormat f= new SimpleDateFormat("yyyy-mm-dd");
		Date joiningDate= f.parse("2020-09-29");
		Date birthDate=f.parse("1997-11-20");
		System.out.println("the Joining Date is:" +f.format(joiningDate));
		System.out.println("the Joining Date is:" +f.format(birthDate));
		
		if(joiningDate.compareTo(birthDate)>0)
		{
			System.out.println("hai");
		}
		else 
		{
			System.out.println("hi");
		}
	}
	
	
	}

	
	




		

	
		
	
		
		


	
	


