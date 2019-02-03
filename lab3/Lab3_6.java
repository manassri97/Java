package lab3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Lab3_6 {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter zone id");
		int id=sc.nextInt();
		System.out.println("1. America/New_York \n"
							+ "2. Europe/London \n"
							+ "3. Asia/Tokyo \n"
							+ "4. US/Pacific \n"
							+ "5. Africa/Cairo \n"
							+ "6. Australia/Sydney \n");
		switch(id)
		{
		case 1: ZonedDateTime c = new ZonedDateTime.now(ZoneId.of("America/New_York"));
				System.out.println();
				break;
				
		}
		sc.close();
	}
}