package test;

import static org.junit.Assert.*;

import org.junit.Test;

import prime.PrimeNumber;

public class TestPrim {
	
	@Test
	public void test2() {
		PrimeNumber p = new PrimeNumber();
		assertTrue(p.isPrime(2));
	}
	
	@Test
	public void test3() {
		PrimeNumber p = new PrimeNumber();
		assertTrue(p.isPrime(3));
	}
	
	@Test
	public void test4() {
		PrimeNumber p = new PrimeNumber();
		assertFalse(p.isPrime(4));
	}
	
	@Test
	public void test5() {
		PrimeNumber p = new PrimeNumber();
		assertTrue(p.isPrime(5));
	}
}
