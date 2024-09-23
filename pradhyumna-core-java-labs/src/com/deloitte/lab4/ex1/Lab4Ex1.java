package com.deloitte.lab4.ex1;
import java.util.*;

public class Lab4Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Smith", 27.2f);
		Person p2 = new Person("Kathy", 43.9f);
		
		Account smith = new Account(111, 3000.0, p1);
		Account kathy = new Account(112, 3000.0, p2);
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println("Updated balance of smith: "+smith.getBalance());
		System.out.println("Updated balance of Kathy: "+kathy.getBalance());
		

	}

}
