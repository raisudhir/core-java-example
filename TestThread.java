package com.demo2;

public class TestThread {

	static class Counter{
		private int c=0;
		
		public void invrement() {
			c++;
		}
		public int value() {
			return c;
		}
	}
	public static void main(final String[] args) throws InterruptedException {
		
		final Counter counter = new Counter();
		for(int i=0; i<=1000; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					counter.invrement();
				}
			}).start();
		}
		Thread.sleep(1000);
		System.out.println("Final number (should be 1000): " + counter.value());
	}
	
}
