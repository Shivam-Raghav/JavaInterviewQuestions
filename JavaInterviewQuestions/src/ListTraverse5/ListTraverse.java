package ListTraverse5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ListTraverse {

	public static void main(String[] args) {
		
		List<String>listStr=new ArrayList<>();
		listStr.add("RAM");
		listStr.add("SYAM");
		listStr.add("JOHN");
		listStr.add("PETER");
		
		//simple loop
		//start - 0, end- size-1
		for(int i=0;i<=listStr.size()-1;i++) {
			System.out.println(listStr.get(i));
		}
		System.out.println("++++++++++++++++++++++++ ");
		
		//for each:collection,list,set
		for(String str:listStr) {
			System.out.println(str);
		}
		System.out.println("++++++++++++++++++++++++ ");
		
		//using iterator
		Iterator<String>itr=listStr.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
		System.out.println("++++++++++++++++++++++++ ");
	}

}
