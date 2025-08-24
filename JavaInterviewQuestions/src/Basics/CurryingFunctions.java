package Basics;

import java.util.function.Function;

public class CurryingFunctions {

	public static void main(String[] args) {
		//Curried Function for Adding u and v
		Function<Integer,Function<Integer,Integer>>
        curryAdder=u->v->u+v;
        //calling the curried functions
        System.out.println("Addition of 2 & 3 is:"+curryAdder);
	}

}
