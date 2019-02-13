package lab3;

import java.util.Scanner;

public class Lab3_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter purchase date");
		int day=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("enter warranty");
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		if(m+m1>12)
		{
			y++;
		}
		m=m+m1;
		y=y+y1;
		System.out.println("date is :"+day+"/ "+m+"/ "+y);
		sc.close();
	}
}