package com.deloitte.lab3.ex3;
import java.util.*;


public class Lab3Ex3 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		s=sc.nextLine();
		AlterString as = new AlterString();
		System.out.println("Altered string is "+as.alterString(s));
	}
}
