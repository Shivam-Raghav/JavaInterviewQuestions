package wrapperClasses;

public class NumberClass {

	public static void main(String[] args) {
		Double d = new Double("6.9685");

		byte b = d.byteValue();
		Integer i = new Integer("10");
		System.out.println("After conversion to byte : " + b);
		System.out.println("Compare : " + i.compareTo(7));
		System.out.println("Compare : " + i.compareTo(11));
		System.out.println("Compare : " + i.compareTo(10));
		System.out.println("Equals : " + i.equals(10));
		System.out.println("ParseInt :  " + Integer.parseInt("101", 2));
		System.out.println("ParseInt : " + Integer.toBinaryString(10));
		System.out.println("ParseInt : " + Integer.valueOf(33));
		System.out.println("Letter Character Class : " + Character.isLetter('A'));
		System.out.println("Digit Character Class : " + Character.isDigit('0'));
		System.out.println("Whitespace Character Class : " + Character.isWhitespace('9'));

	}

}
