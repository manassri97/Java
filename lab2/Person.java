package lab2;

public class Person {
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public Person(String firstName2, String lastName2, char gender2, long number) {
		super();
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.gender = gender2;
		this.number=number;
		
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	private String firstName;
	private String lastName;
	private char gender;
	private long number;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
