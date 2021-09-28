package Assignment.MKData.NET.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Assignment.MKData.NET.model.Employee;

@Repository
public interface EmpRepos extends JpaRepository<Employee, Long>{

}
