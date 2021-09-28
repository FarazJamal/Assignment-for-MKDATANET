package Assignment.MKData.NET.service;

import java.util.List;

import org.springframework.data.domain.Page;

import Assignment.MKData.NET.model.Employee;

public interface EmpServ {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize);

}
