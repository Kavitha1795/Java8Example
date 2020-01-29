package com.accenture.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchandExamples {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, "SSE"),
				new Employee("Harry Major", 25, "SE"), new Employee("Ethan Hardy", 65, "M"),
				new Employee("Nancy Smith", 15, "ASE"), new Employee("Deborah Sprightly", 29, "AM"),
				new Employee("Dick Hiddleton Sprightly", 44, "TL"), new Employee("Alexander Hick", 19, "TL"),
				new Employee("Harry Major", 25, "SSE"), new Employee("Nancy Smith", 15, "SSE"));

		System.out.println("Managers :" + employeeList.stream().
				allMatch(e -> e.getDesignation().equals("M")));

		System.out.println("Managers :" + employeeList.stream().
				anyMatch(e -> e.getDesignation().equals("M")));

		System.out.println("Senior Managers :" + employeeList.stream().
				noneMatch(e -> e.getDesignation().equals("SM")));

		Optional<Employee> emp = employeeList.stream().filter(p -> p.getAge() > 40).
				findAny();

		System.out.println(emp);

		Optional<Employee> emp1 = employeeList.stream().filter(p -> p.getAge() > 40).
				findFirst();

		System.out.println(emp1);
		
		

	}

}
