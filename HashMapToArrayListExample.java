package com.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArrayListExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "ABC");
		map.put(2, "BCD");
		map.put(3, "CDE");
		map.put(4, "DEF");
		//Getting the Set of entries
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		//Creating an ArrayList Of Entry objects
		ArrayList<Entry<Integer,String>> listOfEntry  = new ArrayList<Entry<Integer,String>>(entrySet);
		for(Entry<Integer, String> entry : listOfEntry) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		 System.out.println("--------------------------");
		//Getting Set of keys
		Set<Integer> ketSet = map.keySet();
		 //Creating an ArrayList of keys
		ArrayList<Integer> keyofList = new ArrayList<>(ketSet);
		
		for(Integer i : keyofList) {
			System.out.println(i);
		}
		 System.out.println("--------------------------");
	
		 Collection<String> values = map.values();
		 
		 ArrayList<String> listOfValue = new ArrayList<>(values);
		 
		 for(String ss : listOfValue) {
			 System.out.println(ss);
		 }
	}
}
