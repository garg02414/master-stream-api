package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class LearnComparator {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee("Diana", "Finance", 10000, 4), new Employee("Alice", "IT", 75000, 5),
				new Employee("Charlie", "IT", 80000, 7), new Employee("Bob", "HR", 65000, 3),
				new Employee("Bob", "HR", 72000, 3), new Employee("Evan", "HR", 70000, 2));

		// sort employee alphabetically by name
		List<Employee> copy1 = new ArrayList<>(employees);
		List<Employee> copy2 = copy1.stream().filter(Objects::nonNull).sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());

		System.out.println("sort employee alphabetically by name -");
		for (Employee e : copy2) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");

		// sort employee alphabetically by name reverse order
		List<Employee> copy3 = employees.stream().filter(Objects::nonNull)
				.sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());

		System.out.println("sort employee alphabetically by name reverse order -");
		for (Employee e : copy3) {
			System.out.println(e);
		}

		System.out.println("--------------------------------------------");

		// sort employee by salary ascending order
		List<Employee> copy4 = employees.stream().filter(Objects::nonNull)
				.sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());

		System.out.println("sort employee by salary ascending order -");
		for (Employee e : copy4) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");

		// sort employee by salary descending order
		List<Employee> copy5 = employees.stream().filter(Objects::nonNull)
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());

		System.out.println("sort employee by salary descending order -");
		for (Employee e : copy5) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");

		// sort Employee by department first, then salary within department
		List<Employee> copy6 = employees.stream().filter(Objects::nonNull)
				.sorted(Comparator.comparing(Employee::getDepartment).thenComparingInt(Employee::getSalary))
				.collect(Collectors.toList());

		System.out.println("sort Employee by department first, then salary within department -");
		for (Employee e : copy6) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");

		// return all null value at the last
		List<Employee> copy7 = employees.stream().sorted(Comparator.nullsLast(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toList());

		System.out.println("return all null value at the last -");
		for (Employee e : copy7) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");

		// find highest paid employee

		Optional<Employee> higestPaidEmployee = employees.stream().filter(Objects::nonNull)
				.max(Comparator.comparingInt(Employee::getSalary));

		System.out.println("Highest paid employee in department is " + higestPaidEmployee.get().getName()
				+ " with salary " + higestPaidEmployee.get().getSalary() + "\n");
		
		//find lowest paid employee 
		Optional<Employee> lowestPaidEmployee = employees.stream().filter(Objects::nonNull)
				.min(Comparator.comparingInt(Employee::getSalary));
		System.out.println("Lowest paid employee in department is " + lowestPaidEmployee.get().getName()
				+ " with salary " + lowestPaidEmployee.get().getSalary());
		
		
		//using groupingBy
		Map<String, List<Employee>> byDept =employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		
		for (Map.Entry<String, List<Employee>> entry : byDept.entrySet()) {
		    System.out.println("Department: " + entry.getKey());
		    for (Employee emp : entry.getValue()) {
		        System.out.println("  - " + emp);
		    }}
		
		Map<String, List<Employee>> employeesBySalaryRange = employees.stream()
			    .collect(Collectors.groupingBy(
			        emp -> {
			            if (emp.getSalary() < 50000) return "Low";
			            else if (emp.getSalary() < 100000) return "Medium";
			            else return "High";
			        }
			    ));
		
		for (Map.Entry<String, List<Employee>> entry : employeesBySalaryRange.entrySet()) {
		    System.out.println("Department: " + entry.getKey());
		    for (Employee emp : entry.getValue()) {
		        System.out.println("  - " + emp);
		    }}

	}
	
	

	
}































