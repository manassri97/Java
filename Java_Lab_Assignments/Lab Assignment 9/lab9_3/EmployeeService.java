package lab9_3;

public interface EmployeeService {
	
	String creatEmployee(int id, String name, double salary) throws EmployeeException;
	
	String display(int id);
	
	String getInsuranceScheme(int id);
}