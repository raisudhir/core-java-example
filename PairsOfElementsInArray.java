package com.demo2;

public class PairsOfElementsInArray {

	static void findThePairs(int inputArray[], int inputNumber) {
		
		System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
		for(int i=0; i<inputArray.length; i++) {
			
			for(int j=i+1; j<inputArray.length; j++) {
				int sum= inputArray[i]+inputArray[j];
				if(sum == inputNumber) {
					System.out.println(inputArray[i]+"+ "+inputArray[j]+":"+inputNumber);
				}
			}
		}
		
	}
//4, 6, 5, -10, 8, 5, 20
	public static void main(String[] args) {
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		
	}

	}
