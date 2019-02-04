package lab6_2;

public class SavingAccount extends Account {
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	final private double minBal=500;
	
	public boolean withdraw(double amount,int i, Account[] ac) {
		if(ac[i].getBalance()-minBal>amount) {
			ac[i].setBalance(ac[i].getBalance()-amount);
			return true;
		}
		else
			return false;
	}
	
}
