package com.inter;

public class JavaFirstRepeatedAndNonRepeated {

	public static void main(String[] args) {
		JavaFirstRepeatedAndNonRepeated.nonRepeatedChar("sudhiraa");
	}
	
	static void firstRepeatedNonRepeatedChar(String inputString) {
		
	}
	static void nonRepeatedChar(String inputString) {
		Character ch;
		Character ch1 = null;
		boolean temp=false;
		for(int i=0 ;i <inputString.length();i++) {
			
			ch= inputString.charAt(i);
			for(int j=i+1; j<i; j++) {
				
				//Character ch1=inputString.charAt(j);
				if(ch==inputString.charAt(j)) {
					 temp=true;
					 break;
				}
			}
			if(!temp) {
				//ch1=inputString.charAt(j);
				//System.out.println(inputString.charAt(j));
			}
		}
	}
}
