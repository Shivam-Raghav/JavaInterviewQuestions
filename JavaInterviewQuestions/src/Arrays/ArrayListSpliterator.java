package Arrays;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayListSpliterator {
   public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("abc@gmail.com");
	list.add("xyz@gmail.com");
	list.add("user@gmail.com");
	list.add("shivam2482000@gmail.com");
	list.add("shivam.official8979@gmail.com");
	
	Spliterator<String>emails=list.spliterator();
	
	System.out.println("List of Emails:");
	emails.forEachRemaining((n)->System.out.println(n));
}
}
