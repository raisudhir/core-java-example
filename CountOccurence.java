package com.inter;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

	public static void main(String[] args) {
		int[] input = new int[]{ 1,4,5,2,3,5,1,6,4,7,1,3,6,8,2,5};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		for(int i=0; i< input.length; i++) {
			int key = input[i];
			if(map.containsKey(key)) {
				int count= map.get(key);
				count++;
				map.put(key, count);
			}else {
				map.put(key, 1);
			}
		}
		for(Map.Entry<Integer, Integer> val :map.entrySet()) {
			System.out.println(val.getKey()+":"+val.getValue());
		}
	}

}
