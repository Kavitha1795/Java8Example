package com.accenture.defaultdemos;

interface MyInterface {

	default void printDetails() {
		System.out.println("MyInterface print details method");
	}

	public static void newStaticMethod() {
		System.out.println("MyInterface static method");
	}

	void newMethod();
}

interface MyInterface1 {

	default void printDetails() {
		System.out.println("MyInterface1 printDetails method");
	}
}

interface MyInterface2 extends MyInterface1 {

	default void printDetails() {
		System.out.println("MyInterface2 printDetails Method");
	}
}

class MyClass implements MyInterface, MyInterface1 {

	
	public static void newStaticMethod()
	{
		System.out.println("MyClass static method");
	}
	
	@Override
	public void newMethod() {

		System.out.println("MyClass newMethod");
	}

	@Override
	public void printDetails() {

		MyInterface.super.printDetails();
		MyInterface1.super.printDetails();
	}

}

class MyClass1 implements MyInterface2 {

}

public class DefaultDemo {

	public static void main(String[] args) {

		MyClass m = new MyClass();

		m.printDetails();
		m.newMethod();
		
		MyInterface.newStaticMethod();
		
		MyClass.newStaticMethod();

		MyClass1 m1 = new MyClass1();
		m1.printDetails();

	}

}
