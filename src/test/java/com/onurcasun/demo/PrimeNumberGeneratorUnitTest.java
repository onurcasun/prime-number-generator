package com.onurcasun.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrimeNumberGeneratorUnitTest {
	
	@Value("${primeNumbers1}")
	private int[] primeNumbers1;

	@Value("${primeNumbers2}")
	private int[] primeNumbers2;

	@Value("${primeNumbers3}")
	private int[] primeNumbers3;

	@Value("${primeNumbers4}")
	private int[] primeNumbers4;

	@Test
	void primeNumberGenerationTest1() {		
		int[] primeNumbersActual = PrimeNumberGenerator.GetPrimeNumbers(11);
		assertArrayEquals(primeNumbers1, primeNumbersActual);
	}

	@Test
	void primeNumberGenerationTest2() {				
		int[] primeNumbersActual = PrimeNumberGenerator.GetPrimeNumbers(50);
		assertArrayEquals(primeNumbers2, primeNumbersActual);
	}

	@Test
	void primeNumberGenerationTest3() {		
		int[] primeNumbersActual = PrimeNumberGenerator.GetPrimeNumbers(100);
		assertArrayEquals(primeNumbers3, primeNumbersActual);
	}

	@Test
	void primeNumberGenerationTest4() {		
		int[] primeNumbersActual = PrimeNumberGenerator.GetPrimeNumbers(1000);
		assertArrayEquals(primeNumbers4, primeNumbersActual);
	}

	@Test
	void primeNumberGenerationTestForBadInputValue() {		
		int[] primeNumbersActual = PrimeNumberGenerator.GetPrimeNumbers(0);
		assertNull(primeNumbersActual);
	}
}
