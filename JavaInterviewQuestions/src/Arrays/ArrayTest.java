package Arrays;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		
		int arr[]=new int[34];
		String strs[]=new String[24];
		Object obs[]=new Object[34];
		ArrayList list[]=new ArrayList[5];
		
		
         char chars[]= {'a','b','g','#'};
		// char c
		// int a

		char ch[] = new char[3];
		ch[0]=65;
		ch[1]=66;
		ch[2]=70;
		System.out.println(ch.length);
		//for each
		for(char x: ch) {
			System.out.println(x);
		}
		System.out.println(chars.length);
	}

}
