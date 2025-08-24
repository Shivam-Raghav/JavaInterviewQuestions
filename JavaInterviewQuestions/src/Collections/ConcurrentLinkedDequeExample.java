package Collections;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {

	public static void main(String[] args) {
		ConcurrentLinkedDeque<Integer>cld=new ConcurrentLinkedDeque<Integer>();
		cld.addFirst(100);
		cld.add(200);
		cld.add(300);
		
		System.out.println("ConcurrentLinkedDeque : " + cld);
		System.out.println("The last element is : " + cld.getLast());
		System.out.println("The first element is : " + cld.getFirst());
		cld.removeLast();
		System.out.println("ConcurrentLinkedDeque : " + cld);
	}

}
