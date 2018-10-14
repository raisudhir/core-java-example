package com.interview.question;

public class PrimNo {

	
		 public boolean isPrimeNumber(int number){
	         
		        for(int i=2; i<=number/2; i++){
		            if(number % i == 0){
		                return false;
		            }
		        }
		        return true;
		    }
	
	public static void main(String[] args) {
		PrimNo p = new PrimNo();
		  System.out.println("Is 17 prime number? "+p.isPrimeNumber(17));
	      System.out.println("Is 19 prime number? "+p.isPrimeNumber(19));
	      System.out.println("Is 15 prime number? "+p.isPrimeNumber(6));
	}
}
