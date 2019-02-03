package com.student.main;

import java.util.Scanner;

import com.student.logic.AddStudentDetails;

public class MainApp {

	private static Scanner sc=new Scanner(System.in);
	private static AddStudentDetails as=new AddStudentDetails();
	
	public static void main(String args[])
	{
		showMenu();
	}
	
	private static void showMenu()
	{
		int choice;
		System.out.println("press 1 to add student details");
		System.out.println("press 2 to show all student details");
		System.out.println("press 3 to exit");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:addStudent();
				   break;
			case 2:showStudentDetails();
				   break;
			case 3:System.exit(0);
				   break;
			default:System.out.println("Wrong choice");
		}
	}
	
	private static void showStudentDetails() {
		as.showStudent();
		
	}

	private static void addStudent()
	{
		int rollnumber;
		String name;
		System.out.println("enter roll number");
		rollnumber=sc.nextInt();
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println(as.addStudent(rollnumber,name));
	}

}
