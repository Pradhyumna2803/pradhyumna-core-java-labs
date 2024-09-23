package com.deloitte.lab4.ex1;

public class CurrentAccount extends Account{
	
	double overDraftLimit=-1;
	
	
	public void withdraw(double amt) {
		if(this.getBalance() - amt  <= overDraftLimit) {
			System.out.println("Overdraft amount reached");
		}
		else {
			double val = this.getBalance()-amt;
			this.setBalance(val);
		}
	}
	

}
