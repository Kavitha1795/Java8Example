package com.accenture.streamexamples;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {

		Stream<Integer> numbersStreams = Stream.of(100, 200, 50, 45, 300, 400, 150, 77, 80);

		numbersStreams.filter(i -> i > 100).forEach(i -> System.out.printf("%d ", i));

		Stream<int[]> numStream = Stream.of(new int[] { 10, 20, 30 });

		IntStream n1 = IntStream.of(10, 20, 30);

		LongStream l1 = LongStream.range(10, 20);

		DoubleStream d1 = DoubleStream.of(10.0, 20.3);

		Random r = new Random();
		
		Stream.generate(() -> r.nextInt()).limit(10).forEach(System.out::println);
		

		// numStream.forEach(i->System.out.printf("%d ",i));

	}

}
