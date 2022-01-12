package Assignment;
class product
{
	int id =78;
	String name ="amul";
	
	public void diplay()
	{
		System.out.println("id="+id +"name= "+name);
	}
}
class a extends product
{
	int count = 50;
	String category ="better";
	
	public void diplay()
	{
		System.out.println("count="+count +"category= "+category);
	
 }
}
class b extends product
{
	int count = 90;
	String category ="Milk";
	public void diplay()
	{
		System.out.println("count="+count +"category= "+category);
	
 }
}
  class c extends product
 {
	 int count = 56;
		String category ="chooo";
		public void diplay()
		{
			System.out.println("count="+count +"category= "+category);
		
	     } 
 }
 class suba extends a
 {
	
	 int price=30;
	 int total=count*price;
	public void diplay()
	{
		System.out.println("count = "+count +" category =  "+category + "total = "+total);
	
    } 
	
 }
 class subb extends b
 {
	 int price=10;
	 int total=count*price;
	 public void diplay()
		{
			System.out.println("count = "+count +" category = "+category + "total = "+total);
		
	     } 
 }

public class ass1 extends product {
	public static void main(String args[])
	{
		suba a=new suba();
		a.diplay();
		
		subb g=new subb();
		g.diplay();
	}

}
