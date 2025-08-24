package methods;

/**
 * 
 */
public class ShallowCopy1 {
	int x, y;
}

class ShallowCopy2 implements Cloneable {
	int a, b;
	ShallowCopy1 c = new ShallowCopy1();

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
