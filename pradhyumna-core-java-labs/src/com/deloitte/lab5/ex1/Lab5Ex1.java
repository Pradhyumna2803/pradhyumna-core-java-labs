package com.deloitte.lab5.ex1;

import java.util.Scanner;

public class Lab5Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age  ");
		age=sc.nextInt();
		
		AgeValidator av = new AgeValidator();
		
		try {
            av.vadlidateAge(age);
        } catch (AgeException e) {
            System.err.println("Error: " + e.getMessage());
        }


	}

}
