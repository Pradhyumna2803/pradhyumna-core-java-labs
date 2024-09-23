package com.deloitte.lab6.ex3;
import java.util.*;

public class GetSquares {
	
	public static Map<Integer, Integer> getSquares(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], array[i] * array[i]);
		}
		return map; 
	}
}
