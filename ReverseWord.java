package com.demo;

public class ReverseWord {
public static void main(String[] args) {

	String input= "SUD122HIR";
	//input = input.replaceAll("\\d", "");
	String arr[]=input.split("\\d");
	
	String data= new String();
	for(String s : arr) {
		data=data+s;
	}
	System.out.println(data);
	//Character ch;
	/*for(int i=input.length()-1; i >= 0; i--) {
		ch=input.charAt(i);
		System.out.print(ch);
	}*/
}
}
