package Assignment;
public class thread extends  Thread 
{
	 public void run()
	 {  
		   System.out.println(" name :"+Thread.currentThread().getName());  // name of the thread
		   System.out.println(" state :"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
		   System.out.println(" id :"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		   System.out.println(" alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
	 } 

	public static void main(String[] args)
	{
		thread m1=new thread();  
		thread m2=new thread(); 
		thread m3=new thread(); 
		  
		  m1.setName("IT");
		  m2.setName("FINANCE ");
		  m3.setName("HR");
		 
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m3.setPriority(Thread.NORM_PRIORITY);
		  
		 m2.setDaemon(true); 
		  
		  m1.start();  
		  m2.start();  
		  m3.start();	

	}

}
