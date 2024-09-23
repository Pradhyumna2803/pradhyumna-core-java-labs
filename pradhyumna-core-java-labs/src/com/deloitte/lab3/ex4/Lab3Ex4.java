package com.deloitte.lab3.ex4;
import java.util.*;

public class Lab3Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        ModifyNumber nm = new ModifyNumber();
        
        int modifiedNumber = nm.modifyNumber(number);
        System.out.println("Modified number: " + modifiedNumber);
    }
}

