package Assignments;

public class functionoverloading
{
	public int calculator(int a, int b)
	  {
		System.out.print("sum of numbers = ");
		return a+b;  
		  
	  }
	public double calculator(double r)
	  {
		
		double result= 2*3.124*r; 
		System.out.print("area of circle = ");
	     return result;
		  
	  }
	public double calculator(double l, double b)
	  {
		System.out.print("area of rectangle = ");
		return  l*b; 
	  }

	public static void main(String[] args)
	{
		functionoverloading b=new functionoverloading();
		System.out.println(b.calculator(5,5));
		System.out.println(b.calculator(4));
		System.out.println(b.calculator(8.8,5));
	}

}
