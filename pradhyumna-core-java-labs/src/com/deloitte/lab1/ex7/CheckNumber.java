package com.deloitte.lab1.ex7;
import java.util.*;

public class CheckNumber {
	
	public boolean checkNumber(int n) {
		
		int ld=n%10;
		n=n/10;
		while(n>0) {
			int cd = n % 10;
			if(cd > ld) {
				return false;
			}
			ld=cd;
			n=n/10;
		}
		return true;
	}
}
