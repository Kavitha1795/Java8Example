package com.accenture.fidemos;

import java.util.function.Supplier;

class Person
{
	
	private int personId;
	
	private String name;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}
	
	@Override
	public String toString() {
	
		return "[ Person Id :"+personId+", Name :"+name+" ]";
	}
}



public class SimpleSuppilerDemo {

	public static void main(String[] args) {

		Supplier<Person> s = () -> new Person(100,"Ram");
		Person p = s.get();
	
		System.out.println(p);
	}

}
