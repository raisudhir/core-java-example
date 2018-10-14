package com.demo2;

public class CloseToZero {    
   
	public static void main(String[] args) {
		
		int[] input = {6,4,3,2,5};
		int curr=0;
		int nearnumber= input[0];
		for(int i=0; i<input.length; i++) {
			curr = input[i]* input[i];
			if(curr <=( nearnumber* nearnumber)) {
				nearnumber=input[i];
			}
		}
		System.out.println(nearnumber);
	}
}