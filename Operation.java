package com.interview.question;

public class Operation {
//In case of call by value original value is not changed. Let's take a simple example:
	int data=50;
	void change(Operation o) {
		//this.data=data;
		o.data=o.data+100;//changes will be in the local variable only  
	}
	
	public static void main(String[] args) {
		Operation  operation= new  Operation();
		System.out.println("before change :"+operation.data);
		operation.change(operation);
		System.out.println("after change :"+operation.data);
	}
}
