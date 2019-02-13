package lab9_2;

import java.io.FileInputStream;
import java.io.IOException;

public class Lab9_2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream("C:\\Users\\MANASRIV\\Downloads\\Java-master\\src\\lab9_2\\number.txt");
		
		int i;
		String s="";
		while((i = in.read()) != -1) {
			s += (char)i;
		}
		
		String num[] = s.split(",");
		
		int []numbers = new int[num.length];
		
		for(int x=0; x< num.length; x++) {
			
			numbers[x] = Integer.parseInt(num[x].trim());
			
			if(numbers[x] % 2 == 0) {
				System.out.println(numbers[x]);
			}
		}
		
		in.close();

	}

}
