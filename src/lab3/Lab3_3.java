package lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
		Date d=new Date();
		String date=formatter.format(d);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date");
		String n=sc.nextLine();
		try {
			Date d1 = formatter.parse(n);
			Date d2=formatter.parse(date);
			long diff=d2.getTime()-d1.getTime();
			float dif=(diff/(1000*60*60*24));
			
			System.out.println("no of days are :"+dif);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}