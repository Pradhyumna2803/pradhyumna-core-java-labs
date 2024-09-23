package com.deloitte.lab5.ex2;
import java.util.*;


public class Lab5Ex2 {
	public static void main(String[] args) {
		String fname,lname;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your firstname  ");
		fname=sc.nextLine();
		System.out.println("Enter your lastname  ");
		lname=sc.nextLine();
		
		NameValidator nv = new NameValidator();
		try {
            nv.validateName(fname, lname);
        } catch (NameException e) {
            System.err.println("Error: " + e.getMessage());
        }

	}
}
