package Assignments;

public class shape {
	double l,b,s;
	float r;
	
      shape(double l, double b)
      {
		this.l = l;
		this.b = b;
		
	}
      shape( double s)
      {
  		
  		this.s = s;
  		
  	}
      shape( float r) 
      {
  		
  		
  		this.r = r;
  	}

	public void area()
	{
		System.out.println( l*b);
		System.out.println( s*s);
		System.out.println( 2*3.142*r);
	}
	

	public static void main(String[] args) 
	{
		shape s1 = new shape(2.5,5.6); 
		 s1.area() ; 
		 
		shape s2 = new shape(2);
		 s2.area() ;
		 
		shape s3 = new shape(2.5);         
       s3.area() ;        
        
	}

}
