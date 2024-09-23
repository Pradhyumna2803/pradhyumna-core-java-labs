package com.deloitte.lab2.ex1;
import java.util.*;

public class Lab2Ex1 {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in the array :\n");
		n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elements  :\n");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		GetSecondSmallest gss= new GetSecondSmallest();
		System.out.println("The second smallest number in the array is  "+gss.getSecondSmallest(arr));

		
	}
}
