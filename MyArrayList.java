package com.demo;

import java.util.Arrays;

public class MyArrayList {

	private Object[] myStore;
	private int actSize=0;
	
	public MyArrayList() {
		myStore= new Object[10];
	}
	public void add(Object obj) {
		if(myStore.length-actSize <= 5) {
			
			incrementArrayListSize();
		}
		myStore[actSize++]=obj;
	}
	
	private void incrementArrayListSize() {
		myStore=Arrays.copyOf(myStore, myStore.length*2   );
		System.out.println("Increase the array size");
	}
	public Object get(int index) {
		if(index < actSize) {
			return myStore[index];
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}	
	}
	public int size() {
		return actSize;
	}
	public Object remove(int index) {
		if(index < actSize) {
			 Object obj = myStore[index];
			 myStore[index]=null;
			 int temp = index;
			 if(index < actSize) {
				 myStore[temp]=myStore[temp+1];
				 myStore[temp+1]=null;
				 temp++;
			 }
			 actSize--;
			 return obj;
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}	
	}
	public static void main(String[] args) {
		
		MyArrayList al = new MyArrayList();
		al.add(3);
		//al.add("Sudhir");
		al.add(4);
		al.add(2);
		System.out.println(al);
		System.out.println(al.size());
		
	}
}
