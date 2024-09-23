package com.deloitte.lab4.ex1;
import java.util.*;

public class SavingsAccount extends Account{
	
	final int minBalance=500;
	
	@Override
	public void withdraw(double amt) {
		if(this.getBalance() - amt < minBalance) {
			System.out.println("Your balance is less than the minimum specified balance of 500");
		}
		else {
			double val = this.getBalance() - amt;
			this.setBalance(val);
		}
	}
	
}
