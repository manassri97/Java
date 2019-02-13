package lab8_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Documents\\workspace-sts-3.9.7.RELEASE\\Java Assignments\\src\\lab8_1\\source.txt");
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\HP\\Documents\\workspace-sts-3.9.7.RELEASE\\Java Assignments\\src\\lab8_1\\Target.txt");
		CopyDataThread copy= new CopyDataThread(file, file1);
		copy.start();
		}

}
