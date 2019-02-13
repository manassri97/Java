package lab3;

import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String m=sc.nextLine();
		String s=new String(m);
		System.out.println("enter 1 to add string");
		System.out.println("enter 2 to replace # in odd position");
		System.out.println("enter 3 to replace duplicate characters");
		System.out.println("enter 4 to change odd characters to upper case");
		int ch=sc.nextInt();
		System.out.println(operateString(s,ch));
		sc.close();
	}

	private static String operateString(String s, int ch) {
		
		switch(ch)
		{
			case 1:s=addString(s);
					break;
			case 2:s=replaceOdd(s);
					break;	
			case 3:s=removeDuplicate(s);
					break;
			case 4:s=oddCharacter(s);
					break;
			default:s="wrong choice";
		}
		return s;
	}

	private static String oddCharacter(String s) {
		char[] c=s.toString().toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
				c[i]=Character.toUpperCase(c[i]);
		}
		return new String(c);
	}

	private static String removeDuplicate(String s) {
		int[] c=new int[26];
		char[] c1=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[s.charAt(i)-97]+=1;
		}
		int j=0;
		for(int i=0;i<26 && j<s.length();i++)
		{
			if(c[i]==1)
			{
				c1[j]+=(char)97+i;
				j++;
			}
		}
		return new String(c1);
	}

	private static String replaceOdd(String s) {
		char[] c=s.toString().toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
				c[i]='#';
		}
		return new String(c);
	}

	private static String addString(String s) {
		String o;
		o=s+s;
		return o;
	}
}