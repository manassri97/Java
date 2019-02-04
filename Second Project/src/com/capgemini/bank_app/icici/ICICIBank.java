package com.capgemini.bank_app.icici;

import java.util.LinkedList;

import com.capgemini.bank_app.account.Account;
import com.capgemini.bank_app.exception.InsufficientBalanceException;
import com.capgemini.bank_app.exception.InsufficientOpeningBalanceException;
import com.capgemini.bank_app.exception.InvalidAccountNumberException;
public class ICICIBank {
	
	LinkedList<Account> acc=new LinkedList<>();
	private String output="";
	public String createAccount(int accNumber,int balance)throws InsufficientOpeningBalanceException
	{
		output="";
		if(balance<500) {
			throw new InsufficientOpeningBalanceException("Account cannot be opened with this balance");
		}
		Account ac=new Account(accNumber,balance);
		acc.add(ac);
		output+="Account created successfully"+"\n";
		return output;
	}
	private Account searchAccount(int accNumber)throws InvalidAccountNumberException
	{
		for(Account account:acc)
		{
			if(accNumber==account.getAccNumber())
				return account;
		}
		throw new InvalidAccountNumberException("Please enter correct account number");
	}
	public String withdraw(int accNumber,int amount)throws InvalidAccountNumberException,InsufficientBalanceException
	{
		output="";
		Account account=searchAccount(accNumber);
		if(account.getBalance()-amount<500)
			throw new InsufficientBalanceException("Insufficient Balance");
		else
			account.setBalance(account.getBalance()-amount);
		return output+="Balance :"+account.getBalance()+"\n";
	}
	public String deposit(int accNumber,int amount)throws InvalidAccountNumberException
	{
		output="";
		Account account=searchAccount(accNumber);
		account.setBalance(account.getBalance()+amount);
		return output+="Balance :"+account.getBalance()+"\n";
	}
	public String fundTranfer(int accNumber1,int accNumber2,int amount)throws InvalidAccountNumberException,InsufficientBalanceException
	{
		output="";
		output+=withdraw(accNumber1,amount);
		output+=deposit(accNumber2,amount);
		return output+="\n";
	}
}