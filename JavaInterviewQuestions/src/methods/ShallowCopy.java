package methods;

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCopy2 t1 = new ShallowCopy2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;

		ShallowCopy2 t2 = (ShallowCopy2) t1.clone();

		t2.a = 100;
		t2.c.x = 300;
		System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
		System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);

	}

}
