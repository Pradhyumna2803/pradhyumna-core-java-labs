package com.deloitte.lab1.ex7;
import java.util.*;

public class Lab1Ex7 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		CheckNumber s = new CheckNumber();
		if (s.checkNumber(n)) {
            System.out.println(n + " is an increasing number.");
        } else {
            System.out.println(n + " is not an increasing number.");
        }
	}

}
