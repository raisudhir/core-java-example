package com.inter;

import java.util.Scanner;

public class PairOccurence {

	public static void pairOccur(int[] input, int k) {
		
		
		for(int i=0 ; i<input.length; i++) {
			
			for(int j=i+1; j<input.length; j++) {
				
				if(input[i] + input[j]==k) {
					System.out.println(input[i] +"+"+ input[j]+":"+k);
				}
			}
		}
	}
	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array element= :");
		int n;
		 n = sc.nextInt();
		 int[] a = new int[n];
		 for(int i=0; i<=a.length; i++) {
			 a[i]=sc.nextInt();
		 }
		System.out.println("Enter the  element= :");
		int key=sc.nextInt();
		*/
	// int result= pairOccur(a,key);
		
	pairOccur(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
	}
}
