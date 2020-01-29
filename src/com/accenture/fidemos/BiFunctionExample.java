package com.accenture.fidemos;

import java.util.function.BiFunction;
import java.util.function.Function;

class Multiplication {
	public float multiply(int a, float b) {
		return a * b;
	}

	public int something(int a) {
		return a + 2;
	}
}

public class BiFunctionExample {

	public static void main(String[] args) {
		
		Multiplication m = new Multiplication();
		
		BiFunction<Integer, Float, Float> product = m::multiply;
		
		float multipledValue = product.apply(10, 12.3f);
		
		System.out.println("Multipled Value : "+multipledValue);
		
		Function<Integer, Integer> prd = m::something;
		
		System.out.printf("%d",prd.apply(100));

	}
}
