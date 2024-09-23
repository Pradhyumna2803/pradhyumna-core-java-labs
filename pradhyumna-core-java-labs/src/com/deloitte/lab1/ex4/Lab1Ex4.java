package com.deloitte.lab1.ex4;
import java.util.*;

public class Lab1Ex4 {
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }

        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int limit = sc.nextInt();
        
        System.out.println("Prime numbers up to " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
	}

}
