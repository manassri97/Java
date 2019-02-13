package lab10_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab6_3.com.cg.eis.bean.Employee;

public class TestingLab10_3 {

	@Test()
	public void SuccessfullTest() {
		Employee employee = new Employee();
		employee = new Employee(101,2000,"","Manager","Scheme C");
		
	}

}
