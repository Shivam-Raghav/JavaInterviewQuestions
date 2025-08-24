package Oopsconcepts;

public class Association {

	public static void main(String[] args) {
		Bank bank = new Bank("Axis Bank");
		Employee emp = new Employee("Neha");
		System.out.println(emp.getEmployee() + " is employee of " + bank.getBankName());

	}

}
