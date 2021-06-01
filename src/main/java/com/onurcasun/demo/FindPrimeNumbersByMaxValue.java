package com.onurcasun.demo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindPrimeNumbersByMaxValue {

	public static void main(String[] args) {

		System.out.println("Enter a maximum value to list prime numbers");
		int maxValue = readInputFromConsole();
		int[] primeNumbers = PrimeNumberGenerator.GetPrimeNumbers(maxValue);
		writeResultToConsole(primeNumbers);

	}

	private static void writeResultToConsole(int[] primeNumbers) {
		if (primeNumbers != null) {
			System.out.println("***Prime numbers***");
			for (int i : primeNumbers) {
				System.out.println(i);
			}
		} else {
			System.out.println("Bad input value. The maximum value must be greater than 1.");
		}
	}

	private static int readInputFromConsole() {
		Scanner inputScanner = new Scanner(System.in);
		int maxValue = inputScanner.nextInt();
		inputScanner.close();
		return maxValue;
	}

}
