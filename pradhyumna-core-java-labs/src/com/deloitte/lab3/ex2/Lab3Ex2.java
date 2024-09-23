package com.deloitte.lab3.ex2;
import java.util.*;

public class Lab3Ex2 {
	public static void main(String[] args) {
		String s;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string ");
		s=sc.nextLine();
		
		GetImage gi = new GetImage();
		System.out.println(gi.getImage(s));
	}
}
