package com.demo;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp emp1, Emp emp2) {
	
		Emp e1=(Emp)emp1;
		Emp e2=(Emp)emp2;
		return e1.getName().compareTo(e2.getName());
	}

	
}
