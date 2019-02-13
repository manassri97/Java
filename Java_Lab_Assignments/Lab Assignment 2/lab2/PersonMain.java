package lab2;

import java.util.Scanner;

public class PersonMain {
	
	private static String firstName;
	private static String lastName;
	private static char gender;
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);	
		System.out.println("enter first name");
		firstName=sc.nextLine();
		System.out.println("enter last name");
		lastName=sc.nextLine();
		System.out.println("enter gender");
		gender=sc.nextLine().charAt(0);
		
		Person p=new Person(firstName,lastName,gender);
		
		System.out.println("Person Details");
		System.out.println("---------------------------------"+"\n");
		System.out.println("First Name :"+p.getFirstName());
		System.out.println("Last Name :"+p.getLastName());
		System.out.println("Gender :"+p.getGender());
		sc.close();		
	}

}
