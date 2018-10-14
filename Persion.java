package com.objective;

public class Persion {

	private int perId;
	
	private String perName;
	
	public Persion(int perId,String perName) {
		this.perId=perId;
		this.perName=perName;
	}
	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public int hashCode() {
		int hashCode=0;
		hashCode=perId*101;
		hashCode+=perName.hashCode();
		return hashCode;
		
	}
	public boolean equals(Object obj) {
		if(obj!=null) {
			return true;
		}
		if(obj instanceof Persion) {
			
			Persion pp=(Persion)obj;
			return (pp.perId==this.getPerId() && pp.perName.equals(this.perName));
		}else {
			return false;
		}	
		
	}
	
}
