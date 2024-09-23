package com.deloitte.lab2.ex3;
import java.util.*;

public class Lab2Ex3 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in the array :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		GetSorted gs = new GetSorted();
		int[] narr = gs.getSorted(arr);
		for(int i=0;i<n;i++) {
			System.out.println(narr[i]);
		}
	}
}
