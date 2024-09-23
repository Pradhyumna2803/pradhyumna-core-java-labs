package com.deloitte.lab1.ex6;
import java.util.*;

public class Lab1Ex6 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		
		Solution s=new Solution();
		System.out.println("Difference is "+s.calculateDifference(n));
	}
}
