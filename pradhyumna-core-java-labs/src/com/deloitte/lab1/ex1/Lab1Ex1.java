package com.deloitte.lab1.ex1;
import java.util.*;

public class Lab1Ex1 {
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		Soln s=new Soln();
		System.out.println("The sum is  "+s.cubesOfDigits(n));
	}
}
