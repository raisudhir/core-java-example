package com.objective;

public class SeparateAlphabetsAndDigitsFromString {
	
	public static void main(String[] args) {
		String input = "1a2b3c4defgh567jkl";
		separateDigitsAndAlphabets(input);
	}
	public static void separateDigitsAndAlphabets(String str) {
		String number = "";
        String letter = "";
		for(int i=0; i<str.length(); i++) {
			char c= str.charAt(i);
			if(Character.isDigit(c)) {
				number=number+c;
			}
			else {
                letter = letter + c;

          }
		}
		 System.out.println("Alphates in string:"+letter);
         System.out.println("Numbers in String:"+number);
	}
}
