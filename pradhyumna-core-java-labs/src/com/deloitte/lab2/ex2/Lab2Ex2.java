package com.deloitte.lab2.ex2;

import java.util.Scanner;

public class Lab2Ex2 {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in the array :");
		n=sc.nextInt();
		System.out.println("Enter the strings:  ");
		String[] arr= new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		SortStrings ss = new SortStrings();
		String[] ans= ss.sortStrings(arr);
		System.out.println("The resultant array is ");
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
		
	}

}
