package com.deloitte.lab1.ex5;
import java.util.*;

public class Soln {
	
	int calculateSum(int n) {
		int c=0;
		int sum=0;
		int num=1;
		
		while(c<n)
		{
			if(num % 3 ==0 || num% 5==0) {
				sum += num;
				c++;
			}
			num++;
		}
		return sum;
	}

}
