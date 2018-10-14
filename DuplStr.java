package com.interview.question;

public class DuplStr {

	public static void main(String[] args) {
		String str = "w3wschools";
		int cnt = 0;
		char[] input = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (input[i] == input[j]) {
					System.out.println(input[j]);
					//cnt++;
					break;
				}
			}
		}

	}
}
