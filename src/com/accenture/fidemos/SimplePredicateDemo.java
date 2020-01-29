package com.accenture.fidemos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SimplePredicateDemo {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		list.add("ABC");
		list.add("HELLO");
		list.add("GOOD");
		list.add("ABCDEFGHIJKLMN");
		Predicate<String> p1=s->s.length()<10;
		
		for (String str : list) {
			
			if(p1.test(str))
			{
				System.out.println(str);
			}
			
		}
		
		
	}
}
