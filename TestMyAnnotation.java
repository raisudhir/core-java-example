package com.demo;

@MyAnnotation(value1=10,value2="Arun Kumar",value3="Ghaziabad")  
public class TestMyAnnotation {

	public static void main(String[] args) {
		sayHello();
	}
	public static void sayHello(){System.out.println("hello annotation");}  
}
