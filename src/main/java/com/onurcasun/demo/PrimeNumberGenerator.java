package com.onurcasun.demo;

public class PrimeNumberGenerator {

	private PrimeNumberGenerator() {
		throw new IllegalStateException();
	}
	private static int[] primeNumbers;
	private static boolean[] crossedOut;

	/**
	 * Finds the prime numbers by given maximum value via Sieve of Eratosthenes
	 * algorithm.
	 * 
	 * @param maxValue : the maximum value up to calculate
	 * @return If max value greater than 1 returns prime number array, else returns
	 *         null.
	 */
	public static int[] ByMaxValue(int maxValue) {
		if (maxValue > 1) {
			int sizeOfArray = maxValue + 1;
			initializeArraysUpTo(sizeOfArray);
			markNonPrimeNumbersUpTo(sizeOfArray);
			putUnMarkedNumbersIntoPrimeNumbersArray();
		} else {
			primeNumbers = new int[0];
		}

		return primeNumbers;
	}

	private static void initializeArraysUpTo(int sizeOfArray) {
		crossedOut = new boolean[sizeOfArray];		
		for (int i = 0; i < sizeOfArray; i++) {
			crossedOut[i] = false;
		}
		
		// we know that 0 and 1 is not prime. so we can cross out
		crossedOut[0] = crossedOut[1] = true;
	}

	private static void markNonPrimeNumbersUpTo(int sizeOfArray) {
		// look up to square root of sizeOfArray + 1.
		for (int i = 2; i < Math.sqrt(sizeOfArray) + 1; i++) {
			if (!crossedOut[i]) {
				// we can start with square of i and continue to cross out in multiples of i.
				// because at this step smallest uncrossed value should be equal or greater than
				// square of i.
				for (int j = i * i; j < sizeOfArray; j += i) {
					crossedOut[j] = true;
				}
			}
		}
	}

	private static void putUnMarkedNumbersIntoPrimeNumbersArray() {
		// calculate the number of uncrossed numbers. They are prime numbers.
		int primeNumberCounter = 0;
		for (boolean isCrossedOut : crossedOut) {
			if (!isCrossedOut)
				primeNumberCounter++;
		}

		// initialize and put prime numbers into array
		primeNumbers = new int[primeNumberCounter];
		int j = 0;
		for (int i = 0; i < crossedOut.length; i++) {
			if (!crossedOut[i])
				primeNumbers[j++] = i;
		}
	}

	
}
