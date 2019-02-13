package lab6_2;

import java.util.Scanner;

import lab4_2.person.Person;
import lab4_2.person.Person.type;
import lab4_2.personaccount.Account;
import lab4_2.personaccount.CurrentAccount;
import lab4_2.personaccount.SavingAccount;

public class BussinessScheduler {
	private static Account[] ac=new Account[10];
	private static Scanner sc=new Scanner(System.in);
	private static int count;
	static long a=127115929;
	static double bal=500;
	String output;
	public String createAccount() throws InvalidAgeException{
		System.out.println("enter name");
		String name=sc.nextLine();
		float age;
		age = getAge();
		Person acc=new Person(name,age);
		System.out.println("enter type of account"+"\n"+"enter 1 for SAVING"+"\n"+"enter 2 for CURRENT");
		int t=sc.nextInt();
		sc.nextLine();
		if(t==1)
		{
			acc.setT(type.SAVING);
		}
		else
		{
			acc.setT(type.CURRENT);
		}
		int i=count;
		ac[count++]=new Account(a,bal,acc,acc.getT());
		a++;
		output="";
		return output+="Account created successfully"+"\n"
				+"Account number :"+ac[i].getAccNum()+"\n"
				+"Account holder name :"+ac[i].getAccHolder().getName()+"\n"
				+"Type of account :"+ac[i].getT()+"\n";
	}

	private float getAge()throws InvalidAgeException {
		System.out.println("enter age");
		float age=sc.nextFloat();
		sc.nextLine();
		if(age<15.0)
			throw new InvalidAgeException("Age of a person should be above 15");
		else
			return age;
	}

	public void deposit() {
		System.out.println("enter account number");
		int i=0;
		long number=sc.nextLong();
		for(i=0;i<ac.length && ac[i]!=null;i++) {
			if(number==ac[i].getAccNum())
			{
				System.out.println("enter amount");
				double amount=sc.nextDouble();
				amount+=ac[i].getBalance();
				ac[i].setBalance(amount);
			}
		}
	}

	public void withdraw() {
		System.out.println("enter account number");
		int i=0;
		long number=sc.nextLong();
		for(i=0;i<ac.length && ac[i]!=null;i++) {
			if(number==ac[i].getAccNum())
			{
				System.out.println("enter amount");
				double amount=sc.nextDouble();
				if(ac[i].getT()==type.SAVING) {
					if(new SavingAccount().withdraw(amount,i,ac))
						System.out.println("transaction successful");
					else
						System.out.println("minimum balance reached");
				}
				else
				{
					if(new CurrentAccount().withdraw(amount,i,ac))
						System.out.println("transaction successful");
					else
						System.out.println("overdraft reached");
				}
			}
		}
	}


public double showBalance() {
	System.out.println("enter account number");
	int i=0;
	output="";
	long number=sc.nextLong();
	sc.nextLine();
	for(i=0;i<ac.length && ac[i]!=null;i++) {
		if(number==ac[i].getAccNum())
		{
			break ;
		}
	}
	return ac[i].getBalance();
}
}