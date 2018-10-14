package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestOcc {

	public static void main(String[] args) {
		
		String str="acbdef";
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		
		for(String s: al){
            System.out.println(s);
        }
}}
