package com.accenture.streamexamples;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		String[] strArray = new String[10];

		Optional<String> isValue = Optional.ofNullable(strArray[9]);

		if (isValue.isPresent()) {
			System.out.println(strArray[9].substring(0, 2));
		} else {
			System.out.println("Data is Empty");
		}

		Optional<User> userOptional = Optional.of(new User(100, "Ram"));
		
		User isNullUser = null;
		
		Optional<User> userOptional1 = Optional.ofNullable(isNullUser);

		User u = userOptional.get();

		System.out.println(u);

		userOptional.ifPresent(u1 -> System.out.println(u1.getUserName()));
		
		User u2 = userOptional1.orElse(new User(0, "UnKnown User"));
		
		System.out.println(u2);
		
		User u3 = userOptional1.orElseGet(()->new User(0, "default User"));
		
		System.out.println(u3);
		
		
		

	}

}
