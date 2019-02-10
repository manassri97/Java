package lab7_4;

import java.util.HashMap;
import java.util.Scanner;

public class Lab7_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Double> hash = new HashMap<Integer, Double>();
		Scanner sc = new Scanner(System.in);
		Lab7_4 l = new Lab7_4();
		System.out.println("enter the number of squares");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the numbers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		hash=l.getSquare(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(hash.get(arr[i]));
		}
		sc.close();
	}

	private HashMap<Integer, Double> getSquare(int[] arr) {
		HashMap<Integer, Double> hash1 = new HashMap<Integer, Double>();
		for(int i=0;i<arr.length;i++)
		{
			hash1.put(arr[i], Math.pow(arr[i], 2));
		}
		return hash1;
	}
}
