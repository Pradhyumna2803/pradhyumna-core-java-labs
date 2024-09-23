package com.deloitte.lab5.ex1;

public class AgeValidator {
	
	public static void vadlidateAge(int age) throws AgeException{
		 if (age < 15) {
	            throw new AgeException("Invalid age. Person must be at least 15 years old.");
	        }
	        System.out.println("Age is valid."); // Or handle valid age scenario differently
	    }

}


