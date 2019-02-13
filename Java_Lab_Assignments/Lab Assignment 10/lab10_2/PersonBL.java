package lab10_2;

public class PersonBL {
	
	lab2_5Person person;
	
	public boolean showDetails(String firstName, String lastName, char gender) {
		person = new lab2_5Person(firstName, lastName, gender);
		return true;

	}
	
	public boolean addNumber(long phoneNumber) {
		person.setNumber(phoneNumber);
		return true;
	}

	public String showAll() {
		return "Person Details"+'\n'+"______________________" +
				'\n' + "First Name: " + person.getFirstName() + 
				'\n' + "Last Name: " + person.getLastName() +
				'\n' + "Gender: " + person.getG() + 
				'\n' + "PhoneNumber: " + person.getNumber() +
				'\n';
		
	}
}
