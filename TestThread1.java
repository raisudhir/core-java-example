package com.demo2;

import java.util.concurrent.atomic.AtomicInteger;

public class TestThread1 {

	static class Counter{
		
		AtomicInteger c = new AtomicInteger(0);
		
		public void increment() {
			c.getAndIncrement();
		}
		public  int value() {
			
			return c.get();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		for(int i=0; i<1000; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					counter.increment();
				}
			}).start();
		}
		Thread.sleep(6000);
		System.out.println("Final number (should be 1000): " + counter.value());
	}
}
