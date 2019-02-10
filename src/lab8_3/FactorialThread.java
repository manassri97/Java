package lab8_3;

public class FactorialThread extends Thread{

	
	@Override
	public void run() {
		
	}
	public static int getNumber()
	{
		double n=0;
		n=Math.random();
		return (int)n*10;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FactorialThread f =new FactorialThread();
		FactorialThread f1 =new FactorialThread();
		f.start();
		f1.start();
		f1.join();
	}

}
