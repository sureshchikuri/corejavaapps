package com.vcs.core;

public class StringTypes {

	
	public static void main(String[] args) {

		String s1=new String("suresh");
		//s1.concat("goud");
		s1=s1.concat("goud");
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer("suresh");
		sb.append("goud");
		System.out.println(sb);
		
		System.out.println(s1.equals(sb));
		System.out.println(s1.equals(sb.toString()));
		
	}

}
