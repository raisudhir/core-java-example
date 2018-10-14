package com.inter;

import java.io.Serializable;

public class SingleTone implements Serializable {

	private static SingleTone tone = new SingleTone();;

	private SingleTone() {

	}

	/*protected Object readResolve() {
		return tone;
	}*/

	public static SingleTone getInstance() {

		if (tone == null) { // if there is no instance available... create new one
			tone = new SingleTone();
		}

		return tone;
	}

	/*
	 * protected Object readResolve() { return tone; }
	 */
	public void testDemo() {
		System.out.println("test demo");

	}

}
