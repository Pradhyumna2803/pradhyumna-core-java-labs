package com.deloitte.lab6.ex4;
import java.util.*;

public class GetStudents {
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hashMap) {
		
		HashMap<Integer, String> res = new HashMap<Integer, String>();
		
		for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			
			if (entry.getValue() >= 90) {
				res.put(entry.getKey(), "Gold");
			}
			
			else if (entry.getValue() >= 80 && entry.getValue() < 90) {
				res.put(entry.getKey(), "Silver");
			}
			
			else if (entry.getValue() >= 70 && entry.getValue() < 80) {
				res.put(entry.getKey(), "Bronze");
			}
		}
		return res; 
	}

}
