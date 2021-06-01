package com.onurcasun.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrimeNumberGeneratorUnitTest {
	
	@Test
	void primeNumberGenerationTest1() {
		// System.out.println(primeNumbers1);
		int[] primeNumbersExpected = new int[] { 2, 3, 5, 7, 11 };
		int[] primeNumbersActual = PrimeNumberGenerator.GetPrimeNumbers(11);
		assertArrayEquals(primeNumbersExpected, primeNumbersActual);
	}

	@Test
	void primeNumberGenerationTest2() {
		int[] primeNumbersExpected = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
		int[] primeNumbersActual = PrimeNumberGenerator.GetPrimeNumbers(47);
		assertArrayEquals(primeNumbersExpected, primeNumbersActual);
	}

	@Test
	void primeNumberGenerationTest3() {
		int[] primeNumbersExpected = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
				71, 73, 79, 83, 89, 97 };
		int[] primeNumbersActual = PrimeNumberGenerator.GetPrimeNumbers(100);
		assertArrayEquals(primeNumbersExpected, primeNumbersActual);
	}
}
