package com.objective;

public class Employee {

	private int empId;
	private String empName;
	
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null) {
			return true;
		}
		if(obj instanceof Employee ) {
			
			Employee emp = (Employee) obj;
			
			return (emp.empId==this.empId && emp.empName.equals(this.empName));
		}else {
			return false;
		}
	}
	public int hashCode() {
		int hashCode=0;
		hashCode=empId*1001;
		hashCode+=empName.hashCode();
		return hashCode();
	}
	
	public String toString() {
		return "Employee[empId="+empId+",empName="+empName+"]";
	}
}
