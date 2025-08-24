package Basics;

public class BoundedTypesGenerics {
	public static void main(String[] args) {
		Bound<C>objc=new Bound<C>(new C());
		objc.doRunTest();
		Bound<B>objb=new Bound<B>(new B());
		objb.doRunTest();
		Bound<A>obja=new Bound<A>(new A());
		obja.doRunTest();
	}
}
