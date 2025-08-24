package methods;

public class DeepCopy1 {
	int x, y;
}

class DeepCopy2 implements Cloneable {
	int a, b;
	DeepCopy1 c = new DeepCopy1();

	public Object clone() throws CloneNotSupportedException {
		DeepCopy2 t = (DeepCopy2) super.clone();
		t.c = new DeepCopy1();
		return t;
	}
}
