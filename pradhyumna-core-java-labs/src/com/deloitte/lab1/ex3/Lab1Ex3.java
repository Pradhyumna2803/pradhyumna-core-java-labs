package com.deloitte.lab1.ex3;
import java.util.*;


public class Lab1Ex3 {
	
	
	public static int recFib(int n) {
		if(n==0 ) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else {
			return recFib(n-1)+recFib(n-2);
		}
		
	}
	
	public static void fibonacciSeries(int n) {
		if(n==0)
			System.out.println("Enter a number more than or equal to 1");
			
		if(n==1)
			System.out.println(0);
		
		int f0=0,f1=1;
		System.out.println(f0);
		System.out.println(f1);
		for(int i=2;i<n;i++) {
			int f2=f1+f0;
			System.out.println(f2);
			f0=f1;
			f1=f2;
			
		}
	}
	
	
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of fibonacci series to be printeed  ");
		n=sc.nextInt();
		
		System.out.println("Fibonacci using recursion");
		for(int i=0;i<n;i++) {
			System.out.println(recFib(i)+" ");
		}
		
		
		System.out.println("Fibonacci series without recursion");
		fibonacciSeries(n);

		
	}

}
