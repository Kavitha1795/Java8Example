package com.accenture.lambdaexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface StrValidate {
	boolean check(String s);
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Otto", "ADA", "Bob", "HannaH");

	//	names.forEach((s) -> System.out.println(s));
		
		names.forEach( System.out::println);

		System.out.println();

		StrValidate filterCriteria = str -> str.equals(new StringBuilder(str).reverse().toString());

		List<String> caseSenstiveList = filterString(names, filterCriteria);

		System.out.println(caseSenstiveList);

		StrValidate filterCriteria1 = str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

		List<String> caseInSenstiveList = filterString(names, filterCriteria1);

		System.out.println(caseInSenstiveList);

	}

	public static List<String> filterString(List<String> strList, StrValidate filterCriteria) {
		List<String> result = new ArrayList<>();
		for (String word : strList) {
			if (filterCriteria.check(word)) {
				result.add(word);
			}
		}
		return result;

	}
}
