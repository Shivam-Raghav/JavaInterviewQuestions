package Constructors;

public class CopyConstructor {

	public static void main(String[] args) {
		Complex c1=new Complex(10,20);
		
		//Following involves a copy constructor call
		Complex c2=new Complex(c1);
		Complex c3=c2;
		System.out.println(c2);

	}

}
