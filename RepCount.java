package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepCount {

	public static void main(String[] args) {
		String input="engineer";
		
		List<String> list=Arrays.asList(input.split(""));
		Set<String> set = new HashSet<String>(list);
		 for (String r : set) {
		        System.out.println(r + ": " + Collections.frequency(list, r));
		    }
	}
}
