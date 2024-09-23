package com.deloitte.lab1.ex5;
import java.util.*;

public class Lab1Ex5 {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		Soln s = new Soln();
		System.out.println("The sum is "+s.calculateSum(n));
	}

}
