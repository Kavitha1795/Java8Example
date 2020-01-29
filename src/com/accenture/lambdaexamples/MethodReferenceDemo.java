package com.accenture.lambdaexamples;

@FunctionalInterface
interface Sayable {
	void say();
}

public class MethodReferenceDemo {

	public MethodReferenceDemo() {
		System.out.println("MethodReferenceDemo Constructor");
	}
	public static void sayableHello() {
		System.out.println("Hi Hello");
	}
	public void newMethod() {
		System.out.println("new Method");
	}
	
	public void newMethod1(Sayable s) {
		
		s.say();
	}
	public static void main(String[] args) {

		// Reference to static method
		Sayable s = MethodReferenceDemo::sayableHello;
		s.say();

		// Reference to a instance Method
		MethodReferenceDemo m = new MethodReferenceDemo();
		m.newMethod1(MethodReferenceDemo::sayableHello);
		
		Sayable s1 = m::newMethod;
		s1.say();
		// Reference to Constructor
		Sayable s2 = MethodReferenceDemo::new;
		
		s2.say();

	}
}
