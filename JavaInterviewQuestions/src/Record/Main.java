package Record;

public class Main {

	public static void main(String[] args) {

		var person = new Person(1, "Shivam", "Noida", "8979395980");

		System.out.println(person);
		System.out.println(person.id());
		System.out.println(person.address());
		System.out.println(person.name());
		System.out.println(person.phone());
	}

}
