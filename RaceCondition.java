package com.inter;

public class RaceCondition implements Runnable {

	public int count = 0;

	public void increment() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
	}

	public void decrement() {
		count--;
	}

	public int getValue() {
		return count;

	}

	public void run() {
		synchronized (this) {
			this.increment();
			System.out.println("After Increment" + Thread.currentThread().getName() + ":" + this.getValue());
			this.decrement();
			System.out.println("Decrement" + Thread.currentThread().getName() + ":" + this.getValue());
		}

	}
	public static void main(String[] args) {
		RaceCondition raceCondition = new RaceCondition();
		Thread t1 = new Thread(raceCondition, "Thread-1");
		Thread t2 = new Thread(raceCondition, "Thread-2");
		Thread t3 = new Thread(raceCondition, "Thread-3");
		t1.start();
		t2.start();
		t3.start();
	}

}
