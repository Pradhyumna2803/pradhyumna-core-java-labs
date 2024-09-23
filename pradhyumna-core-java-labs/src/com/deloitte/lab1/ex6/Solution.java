package com.deloitte.lab1.ex6;

public class Solution {
	public int sumOfSquares(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum += i*i;
		}
		System.out.println(sum);
		return sum;
	}
	public int sumOfNumbers(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum += i;
		}
		System.out.println(sum);
		return sum;
	}
	public int calculateDifference(int n) {
		return (sumOfSquares(n) - sumOfNumbers(n));
	}
}
