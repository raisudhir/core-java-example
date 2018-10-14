package com.demo;

public class StringElementOccurence {

	public static void main(String[] args) {
		
		//String input="ABCDE";
		String[] input = {"A", "B", "C", "D"};
		for(int i=0; i<input.length; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print(input[j]);
			}
			int sum=i+1;
			if(i==0) {
				
				System.out.println("....."+sum);
			}
			else {
				//int sum=i+1;
				System.out.println("....."+sum);
			}
			System.out.print("");
		}
	}
}
