package com.inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NameWiseCompare implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		Student st1=(Student)s1;
		Student st2=(Student)s2;
		return st1.getSName().compareTo(st2.getSName());
	}
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1001, "TCS"));
		al.add(new Student(500, "HCL"));
		al.add(new Student(2000, "CTS"));
		
		Collections.sort(al,new NameWiseCompare());
		
		for(Student o : al) {
			System.out.println(o.getsId()+":"+o.getSName());
		}
	}
	
	
	
}
