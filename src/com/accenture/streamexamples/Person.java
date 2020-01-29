package com.accenture.streamexamples;
/**
 * @author pavan.kumar.alapati
 *
 */
public class Person {

	private String name;

	private Integer age;

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public Integer getAge() {
		return this.age;
	}

	public String toString() {
		return "Person [" + this.name + ", " + this.age + "]";
	}
}