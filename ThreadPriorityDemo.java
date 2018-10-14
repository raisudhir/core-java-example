package com.demo2;

class LoopValue implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i< 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		Thread t1= new Thread(new LoopValue(),"Thread-1");
		Thread t2= new Thread(new LoopValue(),"Thread-2");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
