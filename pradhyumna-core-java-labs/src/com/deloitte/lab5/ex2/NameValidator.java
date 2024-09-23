package com.deloitte.lab5.ex2;

public class NameValidator {

    public static void validateName(String firstName, String lastName) throws NameException {
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new NameException("Invalid name. Both first and last name are required.");
        }
        System.out.println("Name is valid."); // Or handle valid name scenario differently
    }
}