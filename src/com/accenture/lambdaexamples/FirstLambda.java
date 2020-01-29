package com.accenture.lambdaexamples;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstLambda {

	public static void main(String[] args) throws InterruptedException {

		// FileFilter filter = new FileFilter() {
		//
		// @Override
		// public boolean accept(File pathname) {
		//
		// return pathname.getName().endsWith(".java");
		// }
		// };

		File f = new File("C:\\Workspaces\\Java8LateralTraining\\Java8Examples\\src\\com\\accenture\\lambdaexamples");

		// File[] files = f.listFiles(filter);
		//
		// for (File f1 : files) {
		// System.out.println(f1.getName());
		// }

		FileFilter lambdaFilter = (File p) -> p.getName().endsWith(".java");

		File[] lambdafiles = f.listFiles(lambdaFilter);

		for (File f1 : lambdafiles) {
			System.out.println(f1.getName());
		}

		System.out.println("-----------------------");
		
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " value " + Thread.currentThread().getName());
			}
		};
		
		Thread t  = new Thread(r);
		t.start();
		t.join();
		
		
		List<Integer> numbersList = Arrays.asList(100,23,34,56,79,24);
		
		System.out.println("Before Sort "+numbersList);
		
		//Comparator<Integer> c = (i1,i2)->i1.compareTo(i2);
		
		Comparator<Integer> c = Integer::compareTo ;
		
		Collections.sort(numbersList,c);
		
		System.out.println("After Sort :"+numbersList);
		
		
		
	}

}
