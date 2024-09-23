package com.deloitte.lab4.ex1;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account() {
		super();
	}

	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	//Methods
	public void deposit(double amt) {
		double val = this.getBalance() + amt;
		this.setBalance(val);
	}
	
	public void withdraw(double amt) {
		double val = this.getBalance() - amt;
		this.setBalance(val);
	}
}
