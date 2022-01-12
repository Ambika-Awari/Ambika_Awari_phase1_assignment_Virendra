package Assignments;

public class overloading 
{
	 overloading(int a)
	{
		int areaofsquare = a*a;
	}
	overloading(int l,int b)
	{
		double areaofrect=l*b;
	}
	overloading(double r)
	{
		 double circle=2*3.142*r;	
	}
	 
	
    
	public static void main(String[] args)
	{
	overloading a=new overloading(36.53);

	System.out.println(a);	
	}

}
