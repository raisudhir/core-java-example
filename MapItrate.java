package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapItrate {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sudhir");
		map.put(3, "Sudhir");
		map.put(2, "Sudhir");
		map.put(5, "Sudhir");

		/*
		 * for(Map.Entry<Integer, String> entry : map.entrySet()) {
		 * System.out.println(entry.getKey()+":"+entry.getValue()); }
		 */
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
