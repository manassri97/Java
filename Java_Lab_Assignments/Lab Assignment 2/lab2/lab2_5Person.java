package lab2;

public class lab2_5Person {
	private String firstName;
	private String lastName;
	private long number;
	private enum Gender {M,F};
	private Gender g;
	private char gender;
	
	public lab2_5Person(String firstName, String lastName, char m) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender=m;
		if(gender=='M')
			g=Gender.M;
		else
			g=Gender.F;
	}
	

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	
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

	public Gender getG() {
		return g;
	}

	public void setG(Gender g) {
		this.g = g;
	}
	
	
	
}
