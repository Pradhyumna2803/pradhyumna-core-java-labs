package com.deloitte.lab6.ex4;
import java.util.*;

public class Lab6Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = sc.nextInt();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		/**
		 * Gets the register number, mark and stores it in to the hashmap
		 */
		for (int i = 0; i < number; i++) {
			int regNo = sc.nextInt();
			int mark = sc.nextInt();
			hashMap.put(regNo, mark);
		}
		
		GetStudents gs = new GetStudents();
		
		HashMap<Integer, String> resultMap = gs.getStudents(hashMap); // Function Call
		/**
		 * Printing the resultant map
		 */
		for (Map.Entry<Integer, String> entry : resultMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println(resultMap);

	}

}
