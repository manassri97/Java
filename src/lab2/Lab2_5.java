package lab2;

import java.util.Scanner;

public class Lab2_5 {
	
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
		if(gender=='M' || gender=='m')
		{
			gender='M';
		}
		else if(gender=='F' || gender=='f')
		{
			gender='F';
		}
		else
		{
			System.out.println("wrong input");
			System.exit(0);
		}
		lab2_5Person p=new lab2_5Person(firstName,lastName,gender);
		
		System.out.println("Person Details");
		System.out.println("---------------------------------"+"\n");
		System.out.println("First Name :"+p.getFirstName());
		System.out.println("Last Name :"+p.getLastName());
		System.out.println("Gender :"+p.getG());
		sc.close();		
	}

}
