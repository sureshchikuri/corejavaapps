package com.vcs.test;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String s="suresh";
		
		//1
		/*int n=s.length();
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=n-1;i>=0;i--){
			sb=sb.append(s.charAt(i));
			
		}
		System.out.println(sb);*/
		
		//2
		StringBuilder sb=new StringBuilder();
		sb=sb.append(s);
		sb=sb.reverse();
		for(int i=0;i<sb.length();i++){
			char c=sb.charAt(i);
			System.out.println(c);
		}
		
	}

}
