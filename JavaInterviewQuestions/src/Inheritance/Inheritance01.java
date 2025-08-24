package Inheritance;

public class Inheritance01 extends Base02 {
	public final void message() {
		System.out.println("Child Class message");
	}

	public static void main(String[] args) {
		new Inheritance01().message();

	}

}
