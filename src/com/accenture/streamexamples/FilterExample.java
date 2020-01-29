package com.accenture.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("Ram", 24), 
				new Person("Sam", 23), new Person("Uday", 42),
				new Person("Yogi", 54), new Person("indra", 84), new Person("sachin", 44));

		personList.stream().filter(p -> p.getAge() > 45).forEach(s->System.out.println(s));

		personList.stream().filter(p -> p.getAge() > 45).forEach(System.out::println);
		
		List<Person> longNamePList =
				personList.stream().filter(p->p.getName().length()>3).limit(2).
				collect(Collectors.toList());
		
		System.out.println(longNamePList);
		
		List<Person> longNamePList1 =
				personList.stream().filter(p->p.getName().length()>3).skip(2).
				collect(Collectors.toList());
		
		System.out.println(longNamePList1);
		
		
		
		
		

	}

}
