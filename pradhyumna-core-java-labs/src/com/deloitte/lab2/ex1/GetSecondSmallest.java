package com.deloitte.lab2.ex1;
import java.util.*;


public class GetSecondSmallest {
	
	public int getSecondSmallest(int[] arr) {
		int n=arr.length;
		if(n==0) {
			System.out.println("Array is empty");
		}
		for(int i=1;i<n;i++) {
			int ele=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j] > ele ) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=ele;
		}
		return arr[1];
	}

}
