package lab3;

import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(check(s));
		sc.close();
	}

	private static String check(String s) {
		int f=0;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i-1)-97>s.charAt(i)-97)
			{
				f=1;
				break;
			}
		}
		if(f==1)
			return "not a positive string";
		else
			return "a positive string";
	}

}
