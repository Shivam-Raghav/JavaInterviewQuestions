package Basics;

public class A {
public void displayClass() {
	System.out.println("Inside super class A");
}
}
class B extends A{
	public void displayClass() {
		System.out.println("Inside sub class B");
	}
}
class C extends A{
	public void displayClass() {
		System.out.println("Inside sub class C");
	}
}


