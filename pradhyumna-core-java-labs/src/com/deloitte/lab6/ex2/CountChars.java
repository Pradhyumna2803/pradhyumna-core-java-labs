package com.deloitte.lab6.ex2;
import java.util.*;

public class CountChars {
	public static Map<Character, Integer> countChars(char[] charArr) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArr.length; i++) {
			char ch = charArr[i];
			if (map.containsKey(ch)) { // Checks whether the character present in that map
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		return map; // Returns the resultant map
	}
}
