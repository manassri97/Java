package lab10_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingLab10_2 {

	@Test
	public void checkingForFirstName() {
		lab2_5Person person = new lab2_5Person();
		person.setFirstName("YANSHU");
		assertEquals("YANSHU", person.getFirstName());
	}
	@Test
	public void checkingForLastName() {
		lab2_5Person person = new lab2_5Person();
		person.setLastName("Gupta");
		assertEquals("Gupta", person.getLastName());
	}
	@Test
	public void checkingForPhoneNumber() {
		lab2_5Person person = new lab2_5Person();
		person.setNumber(1234567890);
		assertEquals(1234567890, person.getNumber());
	}
	
}
