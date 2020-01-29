package com.accenture.dtexamples;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) throws InterruptedException {

		Instant instant = Instant.now();

		System.out.println(instant);
		//
		// System.out.println(Instant.MAX);
		// System.out.println(Instant.MIN);
		// System.out.println(Instant.EPOCH);

		Thread.sleep(2000);

		Instant endInstant = Instant.now();

		Duration elapsedTime = Duration.between(instant, endInstant);
		
		System.out.println(elapsedTime);
	}

}
