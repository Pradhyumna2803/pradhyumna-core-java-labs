package com.deloitte.lab3.ex1;
import java.util.*;


public class Lab3Ex1 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a line of integers (separated by spaces):");
		 String line = scanner.nextLine();
		 
		 StringTokenizer tokenizer = new StringTokenizer(line);

		 int sum = 0;
		 System.out.println("Integers:");
	        while (tokenizer.hasMoreTokens()) {
	            String token = tokenizer.nextToken();
	            int number = Integer.parseInt(token);
	            System.out.println(number);
	            sum += number;
	        }
	        System.out.println("Sum of integers: " + sum);

	}
}
