package Assignments;

public class DataType {

	public static void main(String[] args) {
		boolean status=true;
		System.out.println("i am printing status = " +status);
        
		float percentage =5.3662f;
		char gender = 'M';
		int age =45;
		double pi=3.149586235535236632563;
		long distance=938469523985632L;
		System.out.println("age="+age);
		System.out.println("gender="+gender);
		System.out.println("pi value"+pi );
		System.out.println("distance="+distance);
		System.out.println("percentage=" +percentage);
		
		
		int age1 =67;
		long l=age;
		System.out.println(+l);//implicet 
		long t=85856L;
		int a=(int)t;
		System.out.println(+t);

	}

}
