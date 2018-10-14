package com.demo;

public interface Speed {

	void speedTest();
}
class CityHonda implements Speed{

	@Override
	public void speedTest() {
		// TODO Auto-generated method stub
		System.out.println("speed test of city honda");
	}
	
}
class Marutiswift implements Speed{

	@Override
	public void speedTest() {
		// TODO Auto-generated method stub
		System.out.println("speed of marutiswift");
	}
	
	
}

 