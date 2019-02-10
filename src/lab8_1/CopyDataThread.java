package lab8_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread{
	FileInputStream file;
	FileOutputStream file1;
	public CopyDataThread(FileInputStream file, FileOutputStream file1) {
		this.file=file;
		this.file1=file1;
	}

	public CopyDataThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public synchronized void run()
	{
		try {
			int count=0;
			int i;    
			boolean f = true;
			while(f)
		    {
				count=0;
		    	while((i=file.read())!=-1 && count<10)
		      	{
		      		file1.write((char)i); 
		      		count+=1;
		       	}
		    	if(i==-1)
		    		break;
		    	System.out.println("10 character written"); 
		       	try 
		       	{
					Thread.sleep(5000);
				} 
		       	catch (InterruptedException e) 
		       	{
					System.out.println(e.getMessage());
				}
		    }		
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
