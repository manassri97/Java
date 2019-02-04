package lab6_2;

import java.util.Scanner;
import lab6_2.BussinessScheduler;

public class MainApp {
	private static Scanner sc=new Scanner(System.in);
	private static BussinessScheduler bl=new BussinessScheduler();
	public static void main(String[] args) {
		showMenu();
	}
	private static void showMenu() {
		while(true) {
			System.out.println("enter 1 to create account");
			System.out.println("enter 2 to deposit");
			System.out.println("enter 3 to withdraw");
			System.out.println("enter 4 to display");
			System.out.println("enter 5 to exit");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:try {
					System.out.println(bl.createAccount());
				} catch (InvalidAgeException e) {
					System.out.println(e.getMessage());
				}
						break;
				case 2:bl.deposit();
						break;
				case 3:bl.withdraw();
						break;
				case 4:System.out.println(bl.showBalance());
						break;
				case 5:System.exit(0);
						break;
				default:System.out.println("wrong choice"); 
				}	
			}
		}
}
