package com.inter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="asdfgfds";
		List<String> list = Arrays.asList(str.split(""));
		
		Set<String> set = new HashSet<String>(list);
		for(String ss: set) {
			System.out.println(ss+":"+Collections.frequency(list, ss));
		}
	}

}
