package lab8_2;

public class Timer implements Runnable {

	@Override
	public void run() {
		int count=0;
		boolean f = true;
		while(f)
		{
			System.out.println("Timer :");
			while(count<10) {
			System.out.print((++count)+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			System.out.println("\nRefreshed"); 
			count=0;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Timer());
		t.start();
	

	
	}

}
