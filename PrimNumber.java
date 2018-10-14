package com.demo;

import java.util.Scanner;

public class PrimNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result=sc.nextInt();
		PrimNumber.isPrime(3);
		System.out.println();
	}
	 public static boolean isPrime(int num) {

			    for(int i=2;i<num;i++) {
			        if(num%i==0)
			        	System.out.println("not prim");
			            return false;
			    }
			    return true;
			}
	 }

