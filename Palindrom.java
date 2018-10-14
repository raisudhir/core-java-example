package com.demo;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String original, reverse = ""; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter the value:");
		
		original = in.nextLine();
		
		int length = original.length();
		
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
			if (original.equals(reverse))
				System.out.println("palindrome.");
			else
				System.out.println("Entered string/number isn't a palindrome.");
		}
	}
			
		

}
