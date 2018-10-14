package com.objective;

public final class testjava {

	public static void main(String[] args) {
		try {
			int i=10/0;
			System.out.println("Hello");
			System.exit(0);
		}
		catch (ArithmeticException e) {
		
			System.out.println("ArithmeticException");
		}
		finally{
		
			System.out.println("finally");
			
		}
	}
}
