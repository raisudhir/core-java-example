package com.inter;

public class CustomExacptionUsingUncheck {

	static void isValideAge(int age) throws AgeIsNotValide{
		
		//try {
			if(age > 18) {
				throw new AgeIsNotValide("Age is not valid");
		}
			
			
		
		
	}
	public static void main(String[] args) {
		try {
			isValideAge(3);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
}
