package com.capgemini.bank_app.service;

import com.capgemini.bank_app.exception.InsufficientBalanceException;
import com.capgemini.bank_app.exception.InsufficientOpeningBalanceException;
import com.capgemini.bank_app.exception.InvalidAccountNumberException;
import com.capgemini.bank_app.icici.ICICIBank;

public class Client {

	public static void main(String[] args) {
		
		ICICIBank ib=new ICICIBank();
		try {
			System.out.println(ib.createAccount(101,500));
			System.out.println(ib.createAccount(102,500));
			System.out.println(ib.deposit(101,2000));
			System.out.println(ib.withdraw(101,500));
			System.out.println(ib.fundTranfer(101,102,500));
		}
		catch(InvalidAccountNumberException ane)
		{
			System.out.println(ane.getMessage());
		}
		catch(InsufficientBalanceException ibe)
		{
			System.out.println(ibe.getMessage());
		}
		catch(InsufficientOpeningBalanceException iobe)
		{
			System.out.println(iobe.getMessage());
		}
	}

}
