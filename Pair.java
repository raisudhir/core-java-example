package com.demo2;

import java.util.Scanner;

public class Pair {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int N[]=new int[n];
		for(int i=0;i<n;i++)
		{
				N[i] = sc.nextInt();
		}
		System.out.println("Enter Num:");
		int num = sc.nextInt();
			for(int i=0;i<n;i++)
				{
				for(int j=i+1;j<n;j++)
				{
						if((N[i] +N[j])==num)
							{
								System.out.println("Pair:" +N[i] + "&" + N[j]);
							}
	}
				}}
}
