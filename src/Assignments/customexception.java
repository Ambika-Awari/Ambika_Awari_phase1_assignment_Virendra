package Assignments;
import java.util.Scanner;

public class customexception 
{
	static void account(int salary)throws InvalidAgeException
	{  
	     if(salary <2100)  
	      throw new InvalidAgeException("you need to work hard");  
	     
	    if(salary >= 2100 && salary <= 5000)
	    
		      throw new InvalidAgeException("your salary is somehow good"); 
	    if(salary >= 5100 && salary <= 9000)
		    
		      throw new InvalidAgeException("salary is very good"); 
	    else
	    	System.out.println("amazing!!...");
	   } 
	public static void main(String[] args)
	{
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a salary ");
		 
	       int salary = scanner.nextInt();
	       
		try{  
	        account(salary);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("salary:= "+ m.getMessage());
	      }  

	}

}
class InvalidAgeException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	InvalidAgeException(String s)
	{  //2
	  super(s);  
	 }  
}  
