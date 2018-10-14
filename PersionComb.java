package com.inter;

import java.util.ArrayList;
import java.util.Collections;

public class PersionComb {

	public static void main(String[] args) {
		
		ArrayList<Persion> al= new ArrayList<Persion>();
		al.add(new Persion(20000, "CTS"));
		al.add(new Persion(10000, "TCS"));
		al.add(new Persion(30000, "CAP"));
		al.add(new Persion(15000, "LNT"));
		
		Collections.sort(al);
		
		for(Persion pp: al) {
			System.out.println(pp.getpId()+":"+pp.getpName());
		}
	}
	

}
