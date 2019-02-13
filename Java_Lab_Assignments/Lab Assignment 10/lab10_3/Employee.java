package lab10_3;

public class Employee {
	private int id,salary;
	private String name,designation,iScheme;
	public Employee(int id, int salary, String name, String designation,String s) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
		this.iScheme=s;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getiScheme() {
		return iScheme;
	}
	public void setiScheme(String iScheme) {
		this.iScheme = iScheme;
	}
	
}
