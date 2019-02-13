package lab10_2;

import java.util.Scanner;

public class PersonMain {
	
	static Scanner sc = new Scanner(System.in);
	static PersonBL person;
	public static void main(String[] args) {

		
		
		addPerson();
		addNumber();
		showDetails();
	
	}
	private static void showDetails() {
		System.out.println(person.showAll());
		
	}

	private static void addNumber() {
		System.out.println("Enter Phone Number");
		Long phoneNumber = sc.nextLong();
		person.addNumber(phoneNumber);
	}

	private static void addPerson() {
		person = new PersonBL();
		
		System.out.println("Enter Your First Name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Your Last Name");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Your Gender M/F");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		boolean output = person.showDetails(firstName, lastName, gender);
	}
}
