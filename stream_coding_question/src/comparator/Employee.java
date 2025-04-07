package comparator;

public class Employee {

    String name;
    String department;
    int salary;
    int yearsOfService;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getYearsOfService() {
		return yearsOfService;
	}
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	public Employee(String name, String department, int salary, int yearsOfService) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.yearsOfService = yearsOfService;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + ", yearsOfService="
				+ yearsOfService + "]";
	}
	
    
    
}
