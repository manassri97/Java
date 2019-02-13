package lab7_6;

import java.util.List;

public interface EmployeeService {
	public void addEmployee();
	public boolean deleteEmployee(int id);
	public String acceptInsurance(String scheme);
	public List<Employee> sortEmployee();
}
