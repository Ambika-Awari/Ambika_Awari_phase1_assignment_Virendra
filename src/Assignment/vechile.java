package Assignment;

 abstract class vechiles
 {
	 int speed;
	 long distance;
	 
	 public vechiles(int speed, long distance) 
	 {
		super();
		this.speed = speed;
		this.distance = distance;
	} 
	abstract void run ();
	abstract void stop ();
	abstract void diplay();
	public void fule(int a)
	{
		System .out.println("fule");		
	}
	public void fule(float c ,String b )
	{
	 System .out.println("fule1");	
	}
	public void fule(char c ,int b )
	{
		System .out.println("fule2");	
	}
	
 }
 
class w2 extends vechiles
 {
   public w2(int speed, long distance) {
		super(speed, distance);
		// TODO Auto-generated constructor stub
	}

int no_of_years=2;
   
	public void diplay()
	{
		System.out.println("speed = "+speed);
		System.out.println("distance = "+distance);
		System.out.println("no of years = "+no_of_years);
	}

@Override
void run() 
{
	System.out.println("run of w2 ");
}

@Override
void stop()
{
	System.out.println("stop of w2");
}
	 
	 
 }
class w3 extends vechiles
{
	int no_of_years=3;

	public w3(int speed, long distance) {
		super(speed, distance);
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("run of w3 ");
	
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop of w3");
	}

	@Override
	void diplay() {
		// TODO Auto-generated method stub
		System.out.println("speed = "+speed);
		System.out.println("distance ="+distance);
		System.out.println("no of years = "+no_of_years);
	}
	
}
class w4 extends vechiles
{
	int no_of_years=4;
	
	public w4(int speed, long distance) {
		super(speed, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("run of w4");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop of w4");
	}

	@Override
	void diplay() {
		// TODO Auto-generated method stub
		System.out.println("speed = "+speed);
		System.out.println("distance = "+distance);
		System.out.println("no of years = "+no_of_years);
	}
	
}
class w8 extends vechiles
{
	int no_of_years=8;
	
	public w8(int speed, long distance) {
		super(speed, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("run of w8");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop of w8");
	}

	@Override
	void diplay() {
		// TODO Auto-generated method stub
		System.out.println("speed = "+speed);
		System.out.println("distance = "+distance);
		System.out.println("no of  years = "+no_of_years);
	}

	
}

public  class vechile extends vechiles
{
	public vechile(int speed, long distance) {
		super(speed, distance);
		// TODO Auto-generated constructor stub
	}
	@Override
	void run() {
		System.out.println("run of main");
	}

	@Override
	void stop() {
		System.out.println("stop of main");
		}
	@Override
	void diplay() {
		System.out.println("display");
		
	}

	public static void main(String args[])
	{
	   
		vechile t=new vechile(7, 5);
		t.run();
		t.diplay();
		
		
		System.out.println("-------------------");
		vechiles z=new w2(8, 5);
		z.diplay();
		z.run();
		z.fule(7);
		z.stop();
		System.out.println("-------------------");
		vechiles x=new w3(5,7);
		x.diplay();
		x.run();
		x.fule('h', 18);
		x.stop();
		
		System.out.println("-------------------");
		vechiles w=new w4(4, 5);
		w.diplay();
		w.run();
		w.fule(526985, "AMBIKA");
		w.stop();
		
		System.out.println("-------------------");
		vechiles v=new w8(5, 5);
		v.diplay();
		v.run();
		v.stop();
		System.out.println("-------------------");
		t.stop();
		
		
	}

	
}


