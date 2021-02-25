package com.assignment;
import java.util.*;

public class StringReplacement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the original string");
		String org_str=sc.nextLine();
		System.out.println("Enter the matching string");
		String regex=sc.nextLine();
		System.out.println("Enter the replacement string");
		String rep_str=sc.nextLine();
		String new_str=org_str.replaceAll(regex, rep_str);
		System.out.println("The original string was"+org_str);
		System.out.println("The new string is"+new_str);
		
	}

}
