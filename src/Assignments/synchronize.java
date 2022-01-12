package Assignments;
class Line
{
	// if multiple threads(trains) will try to access this unsynchronized method, they all will get it. So there is chance that Object's state will be corrupted 
	//put synchronized and run
	synchronized public void getLine()                     
	{
		
		
			  System.out.println(" name :"+Thread.currentThread().getName());  // name of the thread
			   System.out.println(" state :"+ Thread.currentThread().getName());  // it will print state of the thread running
			   System.out.println(" id :"+ Thread.currentThread().getName()); // CPU scheduler has given a unique ID to each thread
			   System.out.println(" alive or not? :  "+ Thread.currentThread().getName());  // it will heck if thread is alive or dead	
		
}
}
class Train extends Thread
{
	// reference to Line's Object.
	Line line;

	Train(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}
public class synchronize 
{
	
	public static void main(String[] args)
	{
		Line obj = new Line();

		// creating the threads that are sharing the same Object.
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);
		Train train3=new Train(obj);
		
		train1.setName("it");
		train2.setName("finance");
		train3.setName("hr");
		

		// threads start their execution.
		train1.start();
		train2.start();
		train3.start();
		
	}

}

