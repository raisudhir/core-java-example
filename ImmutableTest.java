package com.inter;

public final class ImmutableTest {

	 private final int id;
	 private final String name;
	 private ImmutableTest(int id,String name) {
		this.id=id;
		this.name=name;
	}
	 public int getId() {
		return id;
		 
	 }
	 public String getName() {
		 return name;
	 }
	 public static void main(String[] args) {
		 ImmutableTest immutableTest = new ImmutableTest(100, "cts");
		 System.out.println(immutableTest.name);
	        System.out.println(immutableTest.id);
	}
}
