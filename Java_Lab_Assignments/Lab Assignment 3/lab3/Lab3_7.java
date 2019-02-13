package lab3;

import java.util.Scanner;

public class Lab3_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f=0;
		System.out.println("enter the id");
		String s=sc.nextLine();
		String[] s1=s.split("_");
		if(s1[0].length()==8)
		{
			if(s1[1].equals("job"))
			{
				f=1;
			}
			else
				f=0;
		}
		if(f==1)
			System.out.println("true");
		else
			System.out.println("false");
		sc.close();
	}

}
