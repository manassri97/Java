package lab7_6;

import java.util.Scanner;

public class MainApp {
	private static Scanner sc=new Scanner(System.in);
	private static EmployeeService s=new EmployeeServiceImpl();

	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		while(true) {
			System.out.println("1. add employee details");
			System.out.println("2. view Insurance Scheme");
			System.out.println("3. remove employee");
			System.out.println("4. sort");
			int choice=sc.nextInt();
			switch(choice) {
			case 1 :s.addEmployee();
					break;
			case 2 :System.out.println("enter the scheme");
					String s1 = sc.nextLine();
					sc.nextLine();
					System.out.println(s.acceptInsurance(s1));
			        break;
			case 3 :System.out.println("enter the id to remove");
					int id=sc.nextInt();
				    s.deleteEmployee(id);
				    System.out.println("Employee Removed");
					break;
			case 4 :System.out.println(s.sortEmployee());
					break;
			default :System.out.println("wrong choice"); 
			}	
		}
	}
}