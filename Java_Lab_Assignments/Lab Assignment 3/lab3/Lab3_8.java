package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array of String");
		int n = sc.nextInt();
		String sb[] = new String[n];
		
		for(int i=0;i<n;i++) {
			sb[i] = sc.next();
		}
		
		Arrays.sort(sb);
		if(n%2==0) {
			for(int i=0;i<sb.length/2;i++) {
				System.out.println(sb[i].toUpperCase());
			}
			for(int i=sb.length/2;i<sb.length;i++) {
				System.out.println(sb[i].toLowerCase());
			}
		}
		else  {
			for(int i=0;i<sb.length/2+1;i++) {
				System.out.println(sb[i].toUpperCase());
			}
			for(int i=sb.length/2+1;i<sb.length;i++) {
				System.out.println(sb[i].toLowerCase());
			}
			
		}
	}

}
