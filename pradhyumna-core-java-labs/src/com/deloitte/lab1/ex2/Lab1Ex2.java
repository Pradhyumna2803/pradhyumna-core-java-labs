package com.deloitte.lab1.ex2;
import java.util.*;


public class Lab1Ex2 {
	public static void main(String[] args) {
		
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your choice of traffic lights");
		ch=sc.next();
		System.out.println(ch);
		if(ch.equalsIgnoreCase("red")) {
			System.out.println("You need to stop your vehicle");
		}
		else if(ch.equalsIgnoreCase("yellow")) {
			System.out.println("Get ready");
		}
		else if(ch.equalsIgnoreCase("green")) {
			System.out.println("Go");
		}
		else {
			System.out.println("The choice you entered is wrong");
		}
	}
}
