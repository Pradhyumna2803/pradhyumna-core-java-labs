package com.deloitte.lab6.ex1;
import java.util.*;

public class Lab6Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of key-value pairs: ");
        int n = scanner.nextInt();

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = scanner.next();
            System.out.print("Enter value: ");
            String value = scanner.next();
            map.put(key, value); 
        }
        GetValues gv = new GetValues();
        List<String> sortedValues = gv.getValues(map);
        System.out.println("Values in sorted order: " + sortedValues);

        scanner.close();
    }

}
