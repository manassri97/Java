package lab7_1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter the array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i);
			arr[i]=sc.nextInt();
		}
		arr=getSorted(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
		sc.close();
	}

	private static int[] getSorted(int[] arr) {
		String e;
		
		for(int i=0;i<arr.length;i++)
		{
			e=String.valueOf(arr[i]);
			StringBuilder s=new StringBuilder(e);
			s.reverse();
			e=s.toString();
			arr[i]=Integer.parseInt(e);
		}
		Arrays.sort(arr);
		return arr;
	}
}