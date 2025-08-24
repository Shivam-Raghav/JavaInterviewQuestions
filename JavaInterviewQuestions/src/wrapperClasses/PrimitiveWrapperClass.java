package wrapperClasses;

public class PrimitiveWrapperClass {

	public static void modify(Integer i) {
		i = i + 1;
	}

	public static void main(String[] args) {
		Integer i = new Integer(12);
		System.out.println("Before modification : " + i);
		modify(i);
		System.out.println("After Modification : " + i);

	}

}
