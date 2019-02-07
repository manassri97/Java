package com.capgemini.payment.UI;

import java.math.BigDecimal;
import java.util.Scanner;

import com.capgemini.payment.bl.WalletRepoImpl;
import com.capgemini.payment.bl.WalletServiceImpl;
import com.capgemini.payment.repo.WalletRepo;
import com.capgemini.payment.service.WalletService;

public class UserInterface {

	static WalletRepo walletRepo = new WalletRepoImpl();
	static WalletService walletService = new WalletServiceImpl(walletRepo);
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		showMenu();
	}
	private static void showMenu() {
		int choice;
		choice = sc.nextInt();
		sc.nextLine();
		while(true)
		{
			System.out.println("1. Create Account \n"
								+"2. Show Wallet Balance \n"
								+"3. Fund Transfer to other Wallet \n"
								+"4. Withdraw from wallet \n"
								+"5. Deposit to wallet \n"
								+"6. Exit");
			switch(choice)
			{
				case 1 :System.out.println("enter the name of customer");
						String name=sc.nextLine();
						if(validateName(name))
						{
							System.out.println("enter the phone number of customer");
							String mobileNo=sc.nextLine();
							if(validateMobileNo(mobileNo))
							{
								System.out.println("enter the balance of customer");
								BigDecimal balance=sc.nextBigDecimal();
								System.out.println(walletService.createAccount(name, mobileNo, balance));
							}
						}
						break;
	
//				case 2 :System.out.println("enter the name of customer");
//						String name=sc.nextLine();
//						System.out.println("enter the phone number of customer");
//						String mobileNo=sc.nextLine();
//						System.out.println("enter the balance of customer");
//						BigDecimal balance=sc.nextBigDecimal();
//						if(validateName(name) && validateMobileNo(mobileNo))
//						{
//							System.out.println(walletService.createAccount(name, mobileNo, balance));
//						}
//						else
//						{
//							break;
//						}
				}
		}
	}
	private static boolean validateMobileNo(String mobileNo) {
		char[] ch = mobileNo.toCharArray();
		if(mobileNo!=null && mobileNo.length()==10)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]<48 || ch[i]>57)
				{
					return false;
				}
			}
		}
		return true;
	}
	private static boolean validateName(String name) 
	{
		char[] ch = name.toLowerCase().toCharArray();
		if(name==null)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]<97 || ch[i]>112)
				{
					return false;
				}
			}
		}
		return true;
	}
}
