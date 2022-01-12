package Assignments;

public class nested {
	

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		try{    
            int a[]=new int[5];    
           a[5]=30/0;
           }    
          catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }  
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }     
       finally
       {
    	   try 
    	   {
    	   int a[]=new int[5];
    	   a[5]=9;
    	   }
    	   catch(ArrayIndexOutOfBoundsException e)  
           {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }    
    	   System.out.println("rest of the code");
       }
	}
		 
}


