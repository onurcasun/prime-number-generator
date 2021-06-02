package com.onurcasun.demo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindPrimeNumbersByMaxValue {

	private static ConsolePrinter consolePrinter = new ConsolePrinter();

	public static void main(String[] args) {
		SpringApplication.run(FindPrimeNumbersByMaxValue.class, args);	

		consolePrinter.printLine("Enter a maximum value to list prime numbers");
		int maxValue = readInputFromConsole();
		int[] primeNumbers = PrimeNumberGenerator.byMaxValue(maxValue);		
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
			consolePrinter.printLine("***Prime numbers***");
			for (int i : primeNumbers) {
				consolePrinter.printLine(i);
			}
		} else {
			consolePrinter.printLine("Bad input value. The maximum value must be greater than 1.");
		}
	}
}
