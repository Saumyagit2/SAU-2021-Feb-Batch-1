package com.assignment;
import java.util.*;

public class Reversekey {
	public static void main(String []args)
    {
        TreeMap<String,String> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of input values: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter key: ");
            String key = sc.next();
            System.out.println("Enter value: ");
            String value = sc.next();
            map.put(key,value);
        }
        
        System.out.println("Orginal Map is : " + map);
        System.out.println("Reverse Order View of Keys: " + map.descendingKeySet());
    }
	

}
