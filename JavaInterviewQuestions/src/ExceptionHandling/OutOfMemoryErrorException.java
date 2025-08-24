package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorException {

	static List<String>list=new ArrayList<String>();
	
	
	public static void main(String[] args) {
		Integer[]array=new Integer[1000*1000];
		System.out.println(array);
				
				

	}

}
