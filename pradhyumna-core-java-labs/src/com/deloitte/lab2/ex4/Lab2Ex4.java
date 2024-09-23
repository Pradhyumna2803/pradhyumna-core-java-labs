package com.deloitte.lab2.ex4;
import java.util.*;

public class Lab2Ex4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in the array :");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array :");		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		ModifyArray ma =new ModifyArray();
		int[] res = ma.modifyArray(arr);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
