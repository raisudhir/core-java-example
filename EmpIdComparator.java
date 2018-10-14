package com.demo;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Emp> {

	

	@Override
	public int compare(Emp a1, Emp a2) {
		
		return a1.getEmpid()-a2.getEmpid();
	}
}
