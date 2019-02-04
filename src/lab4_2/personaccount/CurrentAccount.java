package lab4_2.personaccount;

public class CurrentAccount {
	final private double overdraft=-100000;
	public boolean withdraw(double amount,int i, Account[] ac) {
		if(ac[i].getBalance()-amount>=overdraft) {
			ac[i].setBalance(ac[i].getBalance()-amount);
			return true;
		}
		else
			return false;
	}
}
