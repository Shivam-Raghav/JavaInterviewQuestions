package ExceptionHandling;

public class ChainedExceptions {

	public static void main(String[] args) {
		try {
			// Creating an expression
			NumberFormatException ex = new NumberFormatException("Exception");

			// Setting a cause of the exception
			ex.initCause(new NullPointerException("This is actual cause of the exception"));
			// Throwing an exception with cause
			throw ex;
		} catch (NumberFormatException ex) {
			System.out.println("Excption : " + ex);

			// Getting the actual cause of the exception
			System.out.println(ex.getCause());
		}
	}

}
