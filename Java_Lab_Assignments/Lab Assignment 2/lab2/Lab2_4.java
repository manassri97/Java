package lab2;

import java.util.Scanner;

public class Lab2_4 {
	
	private static String firstName;
	private static String lastName;
	private static char gender;
	private static long number;
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("enter first name");
		firstName=sc.nextLine();
		System.out.println("enter last name");
		lastName=sc.nextLine();
		System.out.println("enter gender");
		gender=sc.nextLine().charAt(0);
		number=acceptNumber();
		
		Person p=new Person(firstName,lastName,gender,number);
		
		System.out.println("Person Details");
		System.out.println("---------------------------------"+"\n");
		System.out.println("First Name :"+p.getFirstName());
		System.out.println("Last Name :"+p.getLastName());
		System.out.println("Gender :"+p.getGender());
		System.out.println("Phone Number :"+p.getNumber());
		sc.close();		
	}

	private static long acceptNumber() {
		long number=0;
		System.out.println("enter phone number");
		number=sc.nextLong();
		return number;
	}

}
