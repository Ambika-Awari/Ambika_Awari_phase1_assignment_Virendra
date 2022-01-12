package Assignments;

public class TypeCasting {

	public static void main(String[] args) {
		//------TYPECASTING FROM BETWEEN INT AND LONG-----//
		int i =100;
		long l=i;
		System.out.println("value = "+l);
		
		int o=(int)l;
		System.out.println("value = "+o);
		
		char t=(char)i;
		System.out.println("value = "+t);
		
		//----------TYPECASTING BETWEEN DOUBLE AND FLOAT------//
		
		double d=632587456329856325.952325885685;
		float r=(float)d;
		System.out.println("value = "+r);
		System.out.println("value = "+d);
		
		//---------TYPECASTING FROM DOUBLE---> LONG--> INT IN SERIES----//
		double d2=8563258456456289652148.42687455;
		long l2=(long)d2;
		int i2=(int)l2;
		System.out.println("value = "+d2);
		System.out.println("value = "+l2);
		System.out.println("value = "+i2);
		
		
		//-------TYPECASTING FROM LONG AND FLOAT----//
		float f =l;
		System.out.println("value = "+f);
		
		//-----Type casting between bye,int and double----//
		byte b;
		int ii=257;
		double dd=323.142;
		
		System.out.println("conversion of int to byte");
		b=(byte)ii;
		System.out.println("ii="+ii +"b = "+b);
		System.out.println("\n conversion of double to byte");
		b=(byte)dd;
		System.out.println("dd=" +dd+"b="+b);
		


	}

}
