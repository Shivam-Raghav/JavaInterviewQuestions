package methods;

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		DeepCopy2 t1 = new DeepCopy2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;
		DeepCopy2 t3 = (DeepCopy2) t1.clone();
		t3.a = 100;
		t3.c.x = 300;
		System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
		System.out.println(t3.a + " " + t3.b + " " + t3.c.x + " " + t3.c.y);
	}

}
