package com.verification;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {

	@Test
	public void test1() {
		AgeVerification ageverify =new AgeVerification();
		assertEquals("right to vote", ageverify.ageValid(25));
	}
	
	@Test
	public void test2() {
		AgeVerification ageverify =new AgeVerification();
		assertEquals("check the age to vote",ageverify.ageValid(10));
		
	}


}
