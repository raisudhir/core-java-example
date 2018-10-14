package com.demo2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDemo implements Runnable{

	private static final ThreadLocal<SimpleDateFormat> df = new ThreadLocal<SimpleDateFormat>() {
		
		protected SimpleDateFormat initialValue() {
			
			System.out.println("Initializing SimpleDateFormat for:"+Thread.currentThread().getName());
			
			return new SimpleDateFormat("dd/MM/yyyy");
			
		}
	};
	@Override
	public void run() {
		
		System.out.println("Thread run execution Start:"+Thread.currentThread().getName());
		System.out.println("Date formate pattern:"+df.get().toPattern());
		System.out.println("Formatted date:"+df.get().format(new Date()));
	}

	public static void main(String[] args) {
		ThreadLocalDemo td = new ThreadLocalDemo();
		
		Thread t1 = new Thread(td, "Thread-1");
		Thread t2 = new Thread(td, "Thread-2");
		
		t1.start();
		t2.start();
	}
	
}
