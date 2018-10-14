package com.inter;

public class SingletonTester {

	public static void main(String[] args) {

		// Instance 1
		SingleTone instance1 = SingleTone.getInstance();

		// Instance 2
		SingleTone instance2 = SingleTone.getInstance();

		// now lets check the hash key.
		System.out.println("Instance 1 hash:" + instance1.hashCode());
		System.out.println("Instance 2 hash:" + instance2.hashCode());
		System.out.println("Instance 3 hash:" + "");

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance1.hashCode() == instance2.hashCode());

	}

}
