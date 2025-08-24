package Basics;

public class Bound<T extends A> {
	private T objRef;
	Bound(T obj) {
		this.objRef=obj;
		
	}
	public void doRunTest() {
		this.objRef.displayClass();
	}
     
}
