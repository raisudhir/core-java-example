package com.demo;

public class MyException {

	static void isvalideAge(int age) throws InvalideAgeException {
		if(age <=18) {
			  throw new InvalideAgeException("Age Invalide");
		}else {
			System.out.println("Welcom");
		}
	}
	
	public static void main(String[] args) {
		try {
			isvalideAge(10);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
