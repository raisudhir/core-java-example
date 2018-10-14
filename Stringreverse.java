package com.demo;

public class Stringreverse {

	public static void main(String[] args) {
		
		String input=" Welcome to my home";
		//String str[]=input.split("");
		int length=input.length();
		String rstr="";
		for(int i=length-1;i>=0; i--) {
			rstr=rstr + input.charAt(i);
			
		}
		System.out.println(rstr+" ");
	}
}
