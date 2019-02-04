package lab6_3.com.cg.eis.service;

import lab6_3.com.cg.eis.exception.EmployeeException;

public interface EmployeeService {
	public String getEmployeeDetails() throws EmployeeException;
	public String getInsuranceScheme();
	public String display();
}
