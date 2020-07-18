package com.suri.java;

public class RemovingSpecialChar {
	
	
	
	public static void main(String[] args) {
		
		String inp= "hai&this*is$suresh%having@fun tonight";
		
		String res = "";
		
		for (int i = 0; i < inp.length(); i++) {
			
			if(inp.charAt(i)<64 && inp.charAt(i)>24 ){
				res+=inp.charAt(i);
			}
		}
		
		System.out.println("Input String :" +inp);
		
		System.out.println("Special Char :"+res);
	}

}
