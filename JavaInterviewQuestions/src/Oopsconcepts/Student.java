package Oopsconcepts;

import java.util.List;

public class Student {
	String name;
	int id;
	String dept;

	Student(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

class Department {
	String name;
	private List<Student> students;

	Department(String name, List<Student> students) {
		this.name = name;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}
}

class Institute {
	String instituteName;
	private List<Department> departments;

	Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
		this.departments = departments;
	}

	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}
