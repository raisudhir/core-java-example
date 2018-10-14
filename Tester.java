package com.interview.question;

public class Tester {

	
	
	
	public static void swap(int a,int b) {
		
		int c= a;
		a=b;
		b=c;
		System.out.println("Swap the two integer value of a :"+a+"b: "+b);
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		swap(30, 40);
		System.out.println("Swap the two integer value of a :"+a+"b: "+b);
		Tester.swap(30, 40);
	}
}
