package com.demo2;

public class GCTest {

	public static void main(String[] args) throws InterruptedException{
		A a = new A("White");
		for(int i=0; i<10000; i++) {
			if(i % 2 ==1) {
				a= new A("read");
			}else {
				a = new A("Green");
			}
		}
		a=null;
		//Runtime.getRuntime().gc();
	}
	
}
class A{
	
	private String color;
	A(String color){
		this.color=color;
	}
	public void finalize() {
		System.out.println(this.color +":"+"cleaned");
	}
}