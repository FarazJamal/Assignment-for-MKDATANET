package Assignment.MKData.NET.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    
    @Column(name = "phone_number")
    private String phoneNumber;    
    
    @Column(name = "hire_date")
    private String hireDate;     
    
    @Column(name = "salary")
    private String salary;     
    
    @Column(name = "manager_id")
    private String managerId;
    
    @Column(name = "department_id")
    private String departmentId;    
    
    
    
    
    
    public long getId() {
        return id;
    } 
    public void setId(long id) {
        this.id = id;
    }
    
    
    
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
    
    
	public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }    
    
  
    
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
	
	
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	
	
	
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

}