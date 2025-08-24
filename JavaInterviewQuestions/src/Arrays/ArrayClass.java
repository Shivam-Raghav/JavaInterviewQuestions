package Arrays;

import java.util.List;

public class ArrayClass {

	public static void main(String[] args) {
		int arr[]= {4,6,5,8,3,9,7,3,2,8};
		System.out.println("Arrays :" +Arrays.toString(arr));
		
       Integer[]newArr=Arrays.toObject(arr);
       List<Integer>al=Arrays.asList(newArr);
       System.out.println("As a List() :" +al);
       
	}

}
