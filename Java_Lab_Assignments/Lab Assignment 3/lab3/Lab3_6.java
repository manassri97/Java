package lab3;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Lab3_6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine().trim();
		Calendar time = Calendar.getInstance();

		time.setTimeZone(TimeZone.getTimeZone(s));

		System.out.println("Time in "+s+" : " + time.get(Calendar.HOUR_OF_DAY) + ":"
		        + time.get(Calendar.MINUTE));

	}

}
