package com.vcs.core;

public class ComparisonTypes {

	
	public static void main(String[] args) {

		String s1=new String("suresh");
		String s2=new String("suresh");
		
		Integer i=10;
		Integer i2=20;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(i==i2);
		System.out.println(i.compareTo(i2));
	}
}
