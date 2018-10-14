package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsinalist {

	public static void main(String[] args) {
		ArrayList<String> 	al = new ArrayList<String>();
		
		al.add("Santosh");
		al.add("Saket");
		al.add("Saket");
		al.add("Shyam");
		al.add("Santosh");
		al.add("Shyam");
		al.add("Santosh");
		al.add("Santosh");
		
		Set<String> set = new HashSet<String>(al);
		set.addAll(al);
		int totalDuplicates =al.size() - set.size();
		System.out.println(totalDuplicates);
	}
	
}
