package Interface;

public class Demo {

	public static void main(String[] args) {
		
		Developer androidDeveloper=new AndroidDeveloper();
         
		Developer iosDeveloper=new IOSDeveloper();
		
		androidDeveloper.develop();
		iosDeveloper.develop();
		androidDeveloper.init();
		iosDeveloper.init();
		
		MyServlet myServlet=new MyServlet();
		myServlet.init();
		myServlet.service();
		myServlet.destroy(); 
		
		MyServlet.init();
		Servlet.init();
	}

}
