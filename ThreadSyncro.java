package com.demo;

class Test1 implements Runnable {
	public  void run() {
		for (int i = 1; i <= 11; i += 2) {
			System.out.println(i);
		}
	}
}

class Test2 implements Runnable {
	public synchronized void run() {
		for (int i = 0; i < 11; i += 2) {
			System.out.println(i);
		}
	}
}


public class ThreadSyncro  {

	public static void main(String[] args) {
		Test1 t1= new Test1();
		Test2 t2= new Test2();
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		tt1.start();
		tt2.start();
		
	}
}
