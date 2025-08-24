package Collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(new Key("One"), 10);
		map.put(new Key("Two"), 20);
		map.put(new Key("Three"), 30);
		
		System.out.println("Value for key One : " + map.get(new Key("One")));
		System.out.println("Value for key Two : " + map.get(new Key("Two")));
		System.out.println("Value for key Three : " + map.get(new Key("Three")));
	}

}
