package com.verification;

public class AgeVerification {
	
	public String ageValid(int age) {
		if(age>=18) {
			return "right to vote";
		}
		else {
			return "check the age to vote";
		}
	}

}
