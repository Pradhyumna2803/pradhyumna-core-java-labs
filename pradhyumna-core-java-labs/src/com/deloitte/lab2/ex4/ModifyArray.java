package com.deloitte.lab2.ex4;
import java.util.*;

public class ModifyArray {
	public int[] modifyArray(int[] arr) {
		int n = arr.length;
        int[] temp = new int[n];
        int uniqueCount = 0;
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        int[] result = new int[uniqueCount];
        Arrays.sort(temp);
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[uniqueCount - 1 - i];
        }


        return result;
		
	}
}
