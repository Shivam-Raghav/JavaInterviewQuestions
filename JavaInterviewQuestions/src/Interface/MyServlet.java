package Interface;

public class MyServlet implements Servlet {

 static	public void init() {
		System.out.println(" creating my servlet object");
	}

	public void service() {
		System.out.println(" my servlet service method ");
	}
}
