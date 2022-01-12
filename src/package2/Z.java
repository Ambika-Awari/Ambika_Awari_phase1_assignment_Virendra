package package2;
import package1.M;
import package1.N;
import package1.P;
public class Z  {

	public static void main(String[] args) 
	{
		
		
		new M().privatemethod();
		new N().privatemethod2();
		//----all variables of X class---//
		System.out.println(new X().h);
		System.out.println(new X().i);
		System.out.println(new X().j);
		new X().publicmethod3();
	}

}
