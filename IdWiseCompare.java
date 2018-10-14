package com.inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IdWiseCompare implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		Student st1=(Student)s1;
		Student st2=(Student)s2;
		if(st1.getsId()==st2.getsId()) {
			return 0;
		}
		else if(st1.getsId() >st2.getsId()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1001, "TCS"));
		al.add(new Student(500, "HCL"));
		al.add(new Student(2000, "CTS"));
		
		Collections.sort(al,new IdWiseCompare());
		
		for(Student o : al) {
			System.out.println(o.getsId()+":"+o.getSName());
		}
	}

}
