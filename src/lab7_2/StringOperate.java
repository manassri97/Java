package lab7_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringOperate
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		String s1=" ";
		String s2=" ";
		System.out.println("enter first string");
		s1=sc.nextLine();
		System.out.println("enter second string");
		s2=sc.nextLine();
		List<String> l=new ArrayList<>();
		l.add(s1=operate1(s1,s2));
		l.add(s1=operate2(s1,s2));
		l.add(s1=operate3(s1,s2));
		l.add(s1=operate4(s1,s2));
		l.add(s1=operate5(s1,s2));
		System.out.println(l);
 	}
	
	private static String operate1(String s1, String s2) {	
		StringBuilder s=new StringBuilder("");
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				s.append(s2);
			}
			else
				s.append(s1.charAt(i));
		}
		s1=s.toString();
		return s1;
	}
	private static String operate2(String s1, String s2) {
		int index=0;
		StringBuilder s=new StringBuilder(s2);
		StringBuilder sb=new StringBuilder(s1);
		if(s1.indexOf(s2)!=-1)
		{
			index=s1.lastIndexOf(s2);
			s.reverse();
			s2=s.toString();
			sb.replace(index,index+s2.length(),s2);
			s1=sb.toString();
			return s1;
		}
		else
		{
			s1=s1+s2;
			return s1;
		}
	}
	private static String operate3(String s1, String s2) {
		int index=0;
		StringBuilder sb=new StringBuilder(s1);
		if(s1.indexOf(s2)!=-1)
		{
			index=s1.indexOf(s2);
			sb.delete(index, s2.length());
			s1=sb.toString();
			return s1;
		}
		else
		{
			s1=s1+s2;
			return s1;
		}
	}
	private static String operate4(String s1, String s2) {
		if(s2.length()%2==0)
		{
			s1=s2.substring(0, s2.length()/2)+s1;
			s1=s1+s2.substring(s2.length()/2);
		}
		else
		{
			s1=s2.substring(0, s2.length()/2+1)+s1;
			s1=s1+s2.substring(s2.length()/2+1);
		}
		return s1; 
	}
	private static String operate5(String s1, String s2) {
		int i=0,j=0;
		char[] c=new char[s1.length()];
		for(i=0;i<s1.length();i++)
		{
			for(j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					c[i]='*';
					break;
				}
				else
					c[i]=s1.charAt(i);
			}
		}
		s1=new String(c);
		return s1;
	}
}