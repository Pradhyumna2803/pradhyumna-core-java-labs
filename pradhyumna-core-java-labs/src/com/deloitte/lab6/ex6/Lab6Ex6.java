package com.deloitte.lab6.ex6;
import java.util.*;

public class Lab6Ex6 {
	
	public static ArrayList<Integer> voterList(HashMap<Integer, Integer> voterMap) {
		
		ArrayList<Integer> voterList = new ArrayList<>();
		for (HashMap.Entry<Integer, Integer> entry : voterMap.entrySet()) {
			
			if (entry.getValue() > 18) {
				voterList.add(entry.getKey());
			}
		}
		return voterList; // Returns the voter list
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> voterMap = new HashMap<>();
		System.out.println("Enter the number of voters");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the id");
			int id = sc.nextInt(); 
			System.out.println("Enter the age");
			int age = sc.nextInt(); 
			voterMap.put(id, age); 
		}
		ArrayList<Integer> voterList = voterList(voterMap);
		System.out.println("The eligible voters are");
		
		for (int index : voterList) {
			System.out.println(index);
		}

	}

}
