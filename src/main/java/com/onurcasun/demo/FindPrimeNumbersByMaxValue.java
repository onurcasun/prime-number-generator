package com.onurcasun.demo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindPrimeNumbersByMaxValue {
	
	public static void main(String[] args) {
		SpringApplication.run(FindPrimeNumbersByMaxValue.class, args);		
		System.err.println("Enter a maximum value to list prime numbers");
		int maxValue = readInputFromConsole();
		int[] primeNumbers = PrimeNumberGenerator.ByMaxValue(maxValue);		
		writeResultToConsole(primeNumbers);
	}

	private static int readInputFromConsole() {
		Scanner inputScanner = new Scanner(System.in);
		int maxValue = inputScanner.nextInt();
		inputScanner.close();
		return maxValue;
	}

	private static void writeResultToConsole(int[] primeNumbers) {
		if (primeNumbers.length > 0) {
			System.err.println("***Prime numbers***");
			for (int i : primeNumbers) {
				System.err.println(i);
			}
		} else {
			System.err.println("Bad input value. The maximum value must be greater than 1.");
		}
	}
}
