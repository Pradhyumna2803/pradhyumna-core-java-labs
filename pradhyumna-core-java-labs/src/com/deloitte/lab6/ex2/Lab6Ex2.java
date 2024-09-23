package com.deloitte.lab6.ex2;
import java.util.*;

public class Lab6Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of characters");
		int number = sc.nextInt();
		char[] charArr = new char[number];
		// Entering the elements into the array
		for (int i = 0; i < number; i++) {
			charArr[i] = sc.next().charAt(0);
		}
		
		CountChars cc = new CountChars();
		Map<Character, Integer> map = cc.countChars(charArr); // Function Call
		/**
		 * Printing the character and count of that character
		 */
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

	}

}
