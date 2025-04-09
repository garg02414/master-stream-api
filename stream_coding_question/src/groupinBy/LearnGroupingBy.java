package groupinBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import comparator.Employee;

public class LearnGroupingBy {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "HR", 60000, 3),
			    new Employee("Alice", "HR", 60000, 4),
			    new Employee("Bob", "IT", 80000, 5),
			    new Employee("Charlie", "HR", 75000, 2),
			    new Employee("David", "IT", 90000, 7)
			);
		
		Map<String, List<Employee>> byDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		System.out.println(byDepartment);
		
		
		//Get department-wise employee names
		
		Map<String, List<String>> depName = employees.stream()
				.collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
		
		System.out.println(depName);
		
		//get count of employee by department
		Map<String, Long> get1= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(get1);
		
		//Extra
		Map<String, Map<String, List<Integer>>> get2= employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getName,Collectors.mapping(Employee::getSalary, Collectors.toList()))));
		System.out.println(get2);
		
		// Group by salary
		Map<String, List<Employee>> get3 = employees.stream().collect(Collectors.groupingBy(e->e.getSalary()>=75000 ? "High" : "Low"));
		
		System.out.println(get3);
		
		
		// sum of salary by department 
		Map<String, Integer> salaryByDept = employees.stream()
			    .collect(Collectors.groupingBy(
			        Employee::getDepartment,
			        Collectors.summingInt(Employee::getSalary)));
		
		System.out.println(salaryByDept);
			
//		Find the highest-paid employee in each department
		
		Map<String, Optional<Employee>> get5 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
		System.out.println(get5);
		
		// find the occurrence of each character
		String str5 = "UmangGargg";
		Map<Object, Long> get6 = Arrays.stream(str5.split("")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
		System.out.println("Total occurence of words " + get6);
	}
	

	
}

























