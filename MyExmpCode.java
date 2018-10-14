package com.objective;

public  class MyExmpCode extends Thread {
	public void run() {
		System.out.println("MyExample....");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyExmpCode());
		t1.start();
		//t1.start(); Exection
	}
}
