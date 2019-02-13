package lab6_2;

import lab6_2.Person;
import lab6_2.Person.type;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	private type t;
	
	public Account(long accNum, double balance,Person acc,type t) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder=acc;
		this.t=t;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public type getT() {
		return t;
	}

	public void setT(type t) {
		this.t = t;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
			return accHolder;
	}

	public void setAccHolder(Person acc) {
			this.accHolder = acc;
	}

	public boolean withdraw(double amount,int i, Account[] ac) {
		ac[i].setBalance(ac[i].getBalance()-amount);
		return true;
	}
}