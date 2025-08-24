package interfaces;

public class Test {
	interface nested {
		void show();
	}
}

class Testing implements Test.nested {

	@Override
	public void show() {
		System.out.println("Show method of interface");

	}

}
