package lab4_2.main;

import java.util.Scanner;
import lab4_2.scheduler.BussinessScheduler;

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
				case 1:System.out.println(bl.createAccount());
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
