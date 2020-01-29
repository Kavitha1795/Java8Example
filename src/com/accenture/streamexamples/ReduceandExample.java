package com.accenture.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceandExample {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, "SSE"),
				new Employee("Harry Major", 25, "SE"), new Employee("Ethan Hardy", 65, "M"),
				new Employee("Nancy Smith", 15, "ASE"), new Employee("Deborah Sprightly", 29, "AM"),
				new Employee("Dick Hiddleton Sprightly", 44, "TL"), new Employee("Alexander Hick", 19, "TL"),
				new Employee("Harry Major", 25, "SSE"), new Employee("Nancy Smith", 15, "SSE"));

		Optional<Employee> e = employeeList.stream().reduce((e1, e2) -> e1.getAge() > e2.getAge() ? e2 : e1);

		Optional<Employee> emp = employeeList.stream().reduce((e1, e2) -> {
			if (e1.getAge() > e2.getAge()) {
				return e2;
			} else {
				return e1;
			}
		});

		System.out.println(e);

		System.out.println(emp);

		List<String> empnames = employeeList.stream().map(m -> m.getName()).
				collect(Collectors.toList());
		
		System.out.println(empnames);
	}

}
