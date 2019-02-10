package lab7_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
	
	private static Scanner sc=new Scanner(System.in);
	HashMap<String, Employee> hash = new HashMap<String, Employee>();

	String desg="";
	String s="";

	@Override
	public void addEmployee() {
		Employee e=new Employee();
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
		e.setId(id);
		e.setName(name);
		e.setSalary(sal);
		e.setDesignation(desg);
		hash.put(Integer.toString(e.getId()), e);
		System.out.println("details addedd successfully");
	}

	@Override
	public boolean deleteEmployee(int id) {
		hash.remove(Integer.toString(id));
		return false;
	}

	@Override
	public String acceptInsurance(String scheme) {
		String out="";
		if(scheme.equals("Scheme A"))
		{
			out="System Associate"+" salary between 5000 to 20000";
		}
		else if(scheme.equals("Scheme B"))
		{
			out="Programmer"+" salary between 20000 to 40000";
		}
		else if(scheme.equals("Scheme c"))
		{
			out="Manager"+" salary above 40000";
		}
		else
		{
			out="clerk "+"salary less than 5000";
		}
		return out;
	}

	@Override
	public List<Employee> sortEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (String key : hash.keySet()) {
			list.add(hash.get(key));
		}
		return list;
	}	
}