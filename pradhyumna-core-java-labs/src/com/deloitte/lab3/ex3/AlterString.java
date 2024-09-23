package com.deloitte.lab3.ex3;

public class AlterString {
	
	boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isCons(char c) {
		return Character.isLetter(c) && !isVowel(c);
	}
	
	
	public String alterString(String ip) {
		StringBuilder sb =new StringBuilder();
		
		 for (int i = 0; i < ip.length(); i++) {
	            char ch = ip.charAt(i);

	            
	            if (isCons(ch)) {
	                if (ch == 'z') {
	                    ch = 'b'; 
	                } else if (ch == 'Z') {
	                    ch = 'B'; 
	                } else {
	                    ch = (char) (ch + 1);
	                    if (isVowel(ch)) {
	                        ch = (char) (ch + 1);
	                    }
	                }
	            }
	            
	            sb.append(ch);
		 }
		 return sb.toString();
		 
	}
	
	
}
