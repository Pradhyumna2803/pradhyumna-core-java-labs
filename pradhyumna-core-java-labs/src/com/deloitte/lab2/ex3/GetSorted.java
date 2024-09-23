package com.deloitte.lab2.ex3;
import java.util.*;

public class GetSorted {
	
	public int reverse(int n) {
		int rev=0,m=n;
		while(m>0) {
			rev = rev*10 +(m%10);
			m=m/10;
		}
		return rev;
	}
	
	public int[] getSorted(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			arr[i]= reverse(arr[i]);
		}
		Arrays.sort(arr);
		return arr;
		
		
	}
}
