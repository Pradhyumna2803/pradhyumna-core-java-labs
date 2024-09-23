package com.deloitte.lab2.ex2;
import java.util.*;

public class SortStrings {
	public String[] sortStrings(String[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		
		int mid = n/2;
		for(int i=0;i<mid;i++) {
			arr[i]=arr[i].toUpperCase();
		}
		for(int i=mid;i<arr.length;i++) {
			arr[i]=arr[i].toLowerCase();
		}
		
		return arr;
	}
}
