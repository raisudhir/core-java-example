package com.objective;

public class SingletoneExample {

	private static SingletoneExample singletoneExample;
	private SingletoneExample()
	{
		
	}
	
	public static SingletoneExample getInstance() {
		singletoneExample= new SingletoneExample();
		return singletoneExample;
		
	}
	
	public void testDemo() {
		System.out.println("singletoneExample");
	}
	public static void main(String[] args) {
		
		SingletoneExample.getInstance().testDemo();
		SingletoneExample.getInstance().testDemo();
		SingletoneExample.getInstance().testDemo();
	}
}
