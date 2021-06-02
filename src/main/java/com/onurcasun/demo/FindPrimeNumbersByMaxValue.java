package com.onurcasun.demo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindPrimeNumbersByMaxValue {

	private static ConsolePrinter consolePrinter = new ConsolePrinter();

	public static void main(String[] args) {
		SpringApplication.run(FindPrimeNumbersByMaxValue.class, args);	

		consolePrinter.PrintLine("Enter a maximum value to list prime numbers");
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
			consolePrinter.PrintLine("***Prime numbers***");
			for (int i : primeNumbers) {
				consolePrinter.PrintLine(i);
			}
		} else {
			consolePrinter.PrintLine("Bad input value. The maximum value must be greater than 1.");
		}
	}
}
