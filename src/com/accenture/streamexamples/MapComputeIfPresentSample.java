package com.accenture.streamexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MapComputeIfPresentSample {
	public static void main(String[] args) {
		Map<Integer, List<Employee>> employeeDOJMap = new HashMap<>();
		List<Employee> list2014 = Arrays.asList(new Employee("Deborah Sprightly", 29, "SSE"));
		employeeDOJMap.put(2014, list2014);
		List<Employee> list2015 = Arrays.asList(new Employee("Tom Jones", 45, "SE"),
				new Employee("Harry Major", 25, "SE"));
		employeeDOJMap.put(2015, list2015);
		List<Employee> list2016 = Arrays.asList(new Employee("Ethan Hardy", 65, "TL"),
				new Employee("Nancy Smith", 22, "AM"));
		employeeDOJMap.put(2016, list2016);

		employeeDOJMap.computeIfAbsent(2017, e -> new ArrayList<Employee>())
		.add(new Employee("Tom ", 45, "SE"));

	}
}
