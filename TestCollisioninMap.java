package com.demo;

import java.util.ArrayList;
import java.util.List;

public class TestCollisioninMap {

	public static void main(String[] args) {
		
		/*Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(2, "Sudhir");
		m.put(4, "Mukesh");
		m.put(2, "Kumar");
		
		for(Map.Entry<Integer, String> entry : m.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}*/
		
		List<String> list= new ArrayList<String>();
		list.add("Sudhir");
		list.add("Mukest");
		list.add("Kumar");
		list.add("Ram");
		System.out.println(list);
		System.out.println("============");
		for(String list1 : list) {
			System.out.println(list);
			
		}
	}
}
