package com.accenture.fidemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SimpleConsumerDemo {

	public static void main(String[] args) {
		List<String> data =Arrays.asList("One", "Two", "Three", "Four", "Five");
		
		Consumer<String> c1 = (str)->System.out.print(str+" ");
		
		data.forEach(c1);

		List<String> result = new ArrayList<>();
		
		Consumer<String> c2 = result::add;
		System.out.println();
		
		System.out.println("Result :"+result.size());

		data.forEach(c1.andThen(c2));
		
		result.forEach(c1);
		
		System.out.println("Result :"+result.size());
		
		

	}

}
