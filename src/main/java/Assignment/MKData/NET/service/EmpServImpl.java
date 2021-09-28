package Assignment.MKData.NET.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageRequestDto;
import org.springframework.stereotype.Service;

import Assignment.MKData.NET.model.Employee;
import Assignment.MKData.NET.repository.EmpRepos;

@Service
public class EmpServImpl implements EmpServ {
	
	@Autowired
	private EmpRepos employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);

	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();			
		}
		else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}
	
	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}

	@Override
	public Page<Employee> findPaginated(int pageNo, int pageSize) {
		PageRequest pageable = PageRequest.of(pageNo - 1, pageSize);
		return this.employeeRepository.findAll(pageable);
	}
	

}
