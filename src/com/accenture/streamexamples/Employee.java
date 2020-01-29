package com.accenture.streamexamples;

public class Employee {

	private String name;

	private int age;

	private String designation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(String name, int age, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
	}

	public String toString() {
		return "Employee Name:" + this.name + "  Age:" + this.age + ", Designation : " + this.designation;
	}

	@Override
	  public boolean equals(Object obj) {
	     if (obj == this) {
	       return true;
	     }
	     if (!(obj instanceof Employee)) {
	       return false;
	     }
	     Employee empObj = (Employee) obj;
	       return this.age==empObj.age
	         && this.name.equalsIgnoreCase(empObj.name)
	         && this.designation.equalsIgnoreCase(empObj.designation)
	         ;
	  }
	  @Override
	  public int hashCode() {
	    int hash = 1;
	    hash = hash * 17 + this.name.hashCode();
	    hash = hash * 31 + this.age;
	    hash = hash* 51+this.designation.hashCode();
	    return hash;
	  }

}
