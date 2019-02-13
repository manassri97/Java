package lab7_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab7_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		list.add("manas");
		list.add("lanas");
		list.add("wanas");
		list.add("menas");
		list.add("ainas");
		Collections.sort(list);
		for(String string : list) {
			System.out.println(string);
		}
		sc.close();
	}
}
