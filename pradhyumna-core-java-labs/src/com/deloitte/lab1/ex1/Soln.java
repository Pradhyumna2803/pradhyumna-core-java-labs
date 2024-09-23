package com.deloitte.lab1.ex1;

public class Soln {
	
	int cubesOfDigits(int n) {
		int sum = 0;
		while(n != 0) {
			int digit = n %10 ;
			sum += digit * digit* digit ;
			n /= 10;
		}
		return sum;
	}

}
