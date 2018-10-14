package com.demo2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double first;
		double second;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number:");
		first = sc.nextDouble();
	 
		System.out.println("Enter the Second Number:");
		 second = sc.nextDouble();
		System.out.println("Enter the operater:");
		char operater=sc.next().charAt(0);
		
		double result;
		
		switch(operater) {
		
		case '+':
			result = first + second;
			break;
		case '-':
			result =  first - second;
		case '*':
			result =  first * second;
		case '%':
			result =  first % second;	
		 default:
             System.out.printf("Error! operator is not correct");
             return;
		}
		System.out.println(first + " and " + second + " is ::::::: " + result);
	}
}
