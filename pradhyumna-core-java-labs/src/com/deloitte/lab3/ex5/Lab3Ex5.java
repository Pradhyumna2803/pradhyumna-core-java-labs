package com.deloitte.lab3.ex5;
import java.util.*;

public class Lab3Ex5 {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text , type 'END' on next line when fineished:");
        
       
        int cc = 0;
        int wc = 0;
        int lc = 0;
        
        
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }
            
            lc++;  //for incrementing line count
            
            cc += line.length();  // for incrementing the character count
            
            
            String[] words = line.trim().split("\\s+");
            wc += words.length;
        }
        
        // Display the results
        System.out.println("Number of lines: " + lc);
        System.out.println("Number of words: " + wc);
        System.out.println("Number of characters: " + cc);
        
    }
}
