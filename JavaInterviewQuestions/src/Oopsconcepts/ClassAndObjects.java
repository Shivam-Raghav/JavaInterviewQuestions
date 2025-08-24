package Oopsconcepts;

public class ClassAndObjects {

	String name;
	String breed;
	int age;
	String color;

	// Constructor Declaration of class
	public ClassAndObjects(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return ("Hi my name is " + this.getName() + "\n My breed,age and color are : " + this.getBreed() + " ,"
				+ this.getAge() + " , " + this.getColor());
	}

	public static void main(String[] args) {
		ClassAndObjects tuffy = new ClassAndObjects("tuffy", "Papillon", 5, "White");
		System.out.println(tuffy.toString());
	}

}
