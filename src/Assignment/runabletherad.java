package Assignment;

public class runabletherad  implements Runnable
{
	public static int myCount = 0;
    public  runabletherad(){
         
    }
    public void run() {
        while( runabletherad.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++ runabletherad.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 

	public static void main(String[] args)
	{
		  System.out.println("Starting Main Thread...");
		  runabletherad mrt = new runabletherad();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(runabletherad.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++runabletherad.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	}

}
