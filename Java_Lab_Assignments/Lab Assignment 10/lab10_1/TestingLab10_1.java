package lab10_1;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestingLab10_1 {

	@Test
	public void checkingForConstructorWorkingOrNot() {
		Date date = new Date(11, 12, 2000);
		String s= "Date is "+11+"/"+12+"/"+2000;
		assertEquals(s, date.toString());
	}
	
	@Test
	public void checkingForSetDayAndGetDay() {
		Date date = new Date(11, 12, 2000);
		assertEquals(11, date.getDay());
	}
	
	@Test
	public void checkingForSetMonthAndGetMonth() {
		Date date = new Date(11, 12, 2000);
		date.setMonth(10);
		assertEquals(10, date.getMonth());
	}

	@Test
	public void checkingForSetYearAndGetYear() {
		Date date = new Date(11, 12, 2000);
		date.setYear(2019);
		assertEquals(2019, date.getYear());
	}


}
