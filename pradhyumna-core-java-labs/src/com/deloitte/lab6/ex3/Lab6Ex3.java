package com.deloitte.lab6.ex3;
import java.util.*;

public class Lab6Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number = sc.nextInt(); // Reading the number of elements in the array
		System.out.println("Enter the elements");
		
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		
		GetSquares gs = new GetSquares();
		
		Map<Integer, Integer> squareMap = gs.getSquares(arr); 
		
		System.out.println("The resultant map is");
		for (Map.Entry<Integer, Integer> entry : squareMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
