package com.inter;

public class Student {
	
	private int sId;
	private String SName;
	
	public Student(int sId,String SName) {
		this.sId=sId;
		this.SName=SName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	
	
}
