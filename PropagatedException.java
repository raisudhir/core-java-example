package com.demo;

public class PropagatedException {

	public void method1() {
		
		int data = 50 / 0; 
		
	}

	private void method2() {
		method1();
		
	}

	private void method3() {
		try {
			method2();
		}catch (Exception e) {
			 //System.out.println("Exception handled");
		}
		
	}
	public static void main(String[] args) {
		PropagatedException exception= new PropagatedException();
		exception.method3();
	}
}
