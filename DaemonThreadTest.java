package com.inter;

public class DaemonThreadTest extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		}
		else {
			System.out.println(getName() + " is User thread");
		}
		
	}
	public static void main(String[] args) {
		DaemonThreadTest dt = new DaemonThreadTest();
		DaemonThreadTest dt1 = new DaemonThreadTest();
		DaemonThreadTest dt2 = new DaemonThreadTest();
		dt.setDaemon(true);
		dt.start();
		dt1.start();
		dt2.start();
		
		
		
	}
	
}
