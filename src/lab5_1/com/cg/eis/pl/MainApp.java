package lab5_1.com.cg.eis.pl;

import java.util.Scanner;

import lab5_1.com.cg.eis.service.Service;

public class MainApp {
	private static Scanner sc=new Scanner(System.in);
	private static Service s=new Service();

	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		while(true) {
			System.out.println("enter 1 to enter employee details");
			System.out.println("enter 2 to view Insurance Scheme");
			System.out.println("enter 3 to display");
			System.out.println("enter 4 to exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println(s.getEmployeeDetails());
			break;
			case 2:System.out.println(s.getInsuranceScheme());
			break;
			case 3:System.out.println(s.display());
			break;
			case 4:System.exit(0);
			break;
			default:System.out.println("wrong choice"); 
			}	
		}
	}
}