package Assignment;
class Line
{
	synchronized public void getLine()                     
	{
		
		for (int i = 0; i < 3; i++)
		{
			
			try
			{
				Thread.sleep(400);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			 System.out.println(" name :"+Thread.currentThread().getName() +i);  // name of the thread
			 System.out.println(" state :"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState() +i);  // it will print state of the thread running
			 System.out.println(" id :"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId() +i); // CPU scheduler has given a unique ID to each thread
			 System.out.println(" alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive() +i);  // it will heck if thread is alive or dead
		}
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

public class synchronize {

	public static void main(String[] args)
	{

		// Object of Line class that is shared among the threads.
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
