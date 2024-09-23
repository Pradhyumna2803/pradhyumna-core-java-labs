package com.deloitte.lab3.ex4;
import java.util.*;

public class ModifyNumber {
	public int modifyNumber(int number) {		
		String nStr = Integer.toString(number);
        
        StringBuilder modifiedNum = new StringBuilder();
        
        for (int i = 0; i < nStr.length() - 1; i++) {

            int digit1 = Character.getNumericValue(nStr.charAt(i));
            int digit2 = Character.getNumericValue(nStr.charAt(i + 1));
            
            int difference = Math.abs(digit1 - digit2);

            modifiedNum.append(difference);
        }
        modifiedNum.append(nStr.charAt(nStr.length() - 1));
        return Integer.parseInt(modifiedNum.toString());
	}
}
