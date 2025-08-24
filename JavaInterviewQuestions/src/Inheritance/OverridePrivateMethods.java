package Inheritance;

public class OverridePrivateMethods {
	private String msg = "Hello World";

	private void fun() {
		System.out.println("Outer function");
	}

	class Inner extends OverridePrivateMethods {
		private void fun() {
			String msg = null;
			System.out.println("Accessing Private Member of Outer : " + msg);

		}
	}

	public static void main(String[] args) {
		OverridePrivateMethods o = new OverridePrivateMethods();
		Inner i = o.new Inner();

		i.fun();

		o = i;
		o.fun();
	}
}
