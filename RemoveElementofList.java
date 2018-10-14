package com.demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RemoveElementofList {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(2);
		
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(2));
		
	}
}
