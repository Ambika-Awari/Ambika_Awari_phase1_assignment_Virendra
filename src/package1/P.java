package package1;


public class P {
	public static void main(String[] args) 
	{
		      //----all variables of M class---//
				System.out.println(new M().b );
				System.out.println(new M().c );
				new M().privatemethod();
				
				
				//----all variables of N class---//
				System.out.println(new N().e );
				System.out.println(new N().f);
				new N().privatemethod2();

	}

}
