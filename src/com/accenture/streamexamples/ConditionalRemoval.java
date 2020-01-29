package com.accenture.streamexamples;

import java.util.ArrayList;
import java.util.List;

public class ConditionalRemoval {

	public static void main(String[] args) {
		List<String> productList = new ArrayList<>();
		productList.add("Mobile");
		productList.add("Laptop");
		productList.add("Garments");
		productList.add("Groceries");
		System.out.println("Before Removal");
		System.out.println("--------------");
		productList.forEach(System.out::println);
		productList.removeIf( s->s.startsWith("G"));
		System.out.println("After Removal");
		System.out.println("-------------");
		productList.forEach(System.out::println);
		
		productList.sort((s,s1)->s.compareTo(s1));
		System.out.println("-------------");
		productList.forEach(System.out::println);
		
		productList.replaceAll(s->s.concat(" Device"));
		
		System.out.println("-------------");
		productList.forEach(System.out::println);
	}

}
