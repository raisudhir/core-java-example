package com.inter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberofOccurenceUsingArray {
public static void main(String[] args) {
	Integer[] a = {2,5,7,6,5,4,6};
	
	
	List<Integer> list =Arrays.asList(a);
	Set<Integer> set = new HashSet<Integer>(list);
	
		for(Integer  aa : set) {
			System.out.println(aa+":"+Collections.frequency(list, aa));
		}
	}
	
}
