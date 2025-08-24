package Oopsconcepts;

public class CreateObjectsUsingClone implements Cloneable {

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	String name = "Hello World ! ";

	public static void main(String[] args) {
		CreateObjectsUsingClone obj1 = new CreateObjectsUsingClone();
		try {
			CreateObjectsUsingClone obj2 = (CreateObjectsUsingClone) obj1.clone();
			System.out.println(obj2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
