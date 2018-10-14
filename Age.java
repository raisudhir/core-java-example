package com.inter;



public class Age {

	static void isValideAge(int age) throws InvalideAgeLimitException {
		if(age <=18) {
			  throw new InvalideAgeLimitException("Invalide Age");
		}else {
			System.out.println("Welcome");
		}
	}
	public static void main(String[] args) {
		try {
			isValideAge(20);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
