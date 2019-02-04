package com.capgemini.bank_app.account;

public class Account {
	
	private int accNumber;
	private int balance;
	public Account(int accNumber, int balance) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
