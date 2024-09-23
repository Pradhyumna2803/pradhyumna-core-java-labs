package com.deloitte.lab1.ex8;
import java.util.*;

public class Lab1Ex8 {
	
	public static boolean checkNumber(int n) {
		
		return n>0 && (n & (n-1))==0;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		System.out.println(checkNumber(n));
	}

}
