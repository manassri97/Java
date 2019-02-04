package lab5_2.service;

import java.util.Scanner;

import lab5_1.com.cg.eis.bean.Employee;

public class Service implements EmployeeService{
	private static Scanner sc=new Scanner(System.in);
	private static Employee[] emp=new Employee[10];
	int count=0;
	String desg="";
	String s="";
	@Override
	public String getEmployeeDetails() {
		System.out.println("enter employee ID");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter employee name");
		String name=sc.nextLine();
		System.out.println("enter employee salary");
		int sal=sc.nextInt();
		sc.nextLine();
		if(sal>5000 && sal<20000)
			desg="System Associate";
		else if(sal>=20000 && sal<40000)
			desg="Programmer";
		else if(sal>=40000)
			desg="Manager";
		else
			desg="Clerk";
		if(sal>5000 && sal<20000 && desg.equals("System Associate"))
		{
			s="Scheme A";
		}
		else if(sal>=20000 && sal<40000 && desg.equals("Programmer"))
		{
			s="Scheme B";
		}
		else if(sal>=40000 && desg.equals("Manager"))
		{
			s="Scheme C";
		}
		else
		{
			s="No Scheme";
		}
	Employee e=new Employee(id,sal,name,desg,s);
	emp[count++]=e;
	return "Details added successfully";
}

@Override
public String getInsuranceScheme() {
	System.out.println("enter employee id");
	int c=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<emp.length && emp[i]!=null;i++)
	{
		if(emp[i].getId()==c)
		{
			if(emp[i].getSalary()>5000 && emp[i].getSalary()<20000 && emp[i].getDesignation().equals("System Associate"))
			{
				emp[i].setiScheme("Scheme A");
			}
			else if(emp[i].getSalary()>=20000 && emp[i].getSalary()<40000 && emp[i].getDesignation().equals("Programmer"))
			{
				emp[i].setiScheme("Scheme B");
			}
			else if(emp[i].getSalary()>=40000 && emp[i].getDesignation().equals("Manager"))
			{
				emp[i].setiScheme("Scheme C");
			}
			else
			{
				emp[i].setiScheme("No Scheme");
			}
		return emp[i].getName()+"\t"+emp[i].getSalary()+"\t"+emp[i].getiScheme();
		}
	}
	return "wrong credentials";
}

@Override
public String display() {
	System.out.println("enter employee id");
	int c1=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<emp.length && emp[i]!=null;i++)
	{

		if(emp[i].getId()==c1)
		{
			return " \n"+emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSalary()+"\t"+emp[i].getDesignation()+"\t"+emp[i].getiScheme();
		}
	}
	return "Wrong credentials";
}
}