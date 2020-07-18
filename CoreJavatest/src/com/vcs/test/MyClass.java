package com.vcs.test;

public class MyClass {
	
	public static void main(String[] args) {
		
		String s="suresh";
		
		StringBuffer sb=new StringBuffer();
		
		sb.append(s);
		
		sb=sb.reverse();
		
		for(int i=0;i<sb.length();i++){
			System.out.println(sb.charAt(i));
		}
		
	}

	

}
