package com.deloitte.lab6.ex7;
import java.util.*;

public class Lab6Ex7 {
	
	public static int[] getSorted (int[] arr) {
		StringBuffer br=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			br.append(arr[i]);
			br.append(" ");
		}
		br.reverse();//to reverse the string //reverse the numbers in the array
		System.out.println(br);
		int[] output=new int[arr.length];
		String[] a=br.toString().trim().split(" ");
		for(int i=0;i<a.length;i++) {
			output[i]=Integer.parseInt(a[i]);
		}
		Arrays.sort(output);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of the array: ");
		String[] a=sc.nextLine().trim().split(" ");
		int[] input=new int[a.length];
		for(int i=0;i<a.length;i++) {
			input[i]=Integer.parseInt(a[i]);
		}
		System.out.println("Reversed array after sorting: "+Arrays.toString(getSorted(input)));

	}

}
