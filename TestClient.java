package com.demo;

import java.util.ArrayList;
import java.util.Collections;

public class TestClient {

	public static void main(String[] args) {
		
		ArrayList<Emp> ar = new ArrayList<Emp>();
        ar.add(new Emp(111, "bbbb"));
        ar.add(new Emp(131, "aaaa"));
        ar.add(new Emp(121, "cccc"));
        Collections.sort(ar, new NameComparator());
        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
        
        System.out.println("====================");
        
        Collections.sort(ar, new EmpIdComparator());
        for(int i=0; i<ar.size();i++) {
        	System.out.println(ar.get(i));
        }
	}
	
	
}
