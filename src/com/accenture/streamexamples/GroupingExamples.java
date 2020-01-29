package com.accenture.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingExamples {

	
	public static void main(String[] args) {
		
		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, "SSE"),
				new Employee("Harry Major", 25, "SE"), new Employee("Ethan Hardy", 65, "AM"),
				new Employee("Nancy Smith", 15, "TL"), new Employee("Deborah Sprightly", 29, "SSE"),
				new Employee("Dick Hiddleton Sprightly", 44, "SE"), new Employee("Alexander Hick", 19, "TL"),
				new Employee("Harry Major", 25, "AM"), new Employee("Nancy Smith", 15, "SSE"));
		
		
		Map<String, Set<Employee>> map  =
				employeeList.stream().collect(Collectors.groupingBy(e->e.getDesignation(),
						Collectors.toSet()));
		
		map.forEach((k,v)->System.out.println("Designation :"+k+", Set of Employees"+v));
	
		
		System.out.println("--------------------------");

		Map<String, Set<Employee>> emp = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getDesignation(), Collectors.toSet())).
				entrySet().stream()
				.filter(e -> e.getValue().size() > 2).flatMap(m -> m.getValue().stream())
				.collect(Collectors.groupingBy(e -> e.getDesignation(), Collectors.toSet()));

		emp.forEach((d, l) -> System.out.println("Designation :" + d + ", List of Employees" + l));
		
		
		System.out.println("--------------------------");
		Map<String, Optional<Employee>> maxageEmployee = employeeList.stream().
				collect(Collectors
				.groupingBy(e -> e.getDesignation(), 
						Collectors.maxBy((e1, e2) -> e1.getAge() - e2.getAge())));

		maxageEmployee.forEach((d, l) -> System.out.println("Designation :" + d +
				", List of Employees" + l));
		
		Double averageAge  =employeeList.stream().
		collect(Collectors.averagingDouble(e->e.getAge()));
		System.out.println(averageAge);
	}
}
