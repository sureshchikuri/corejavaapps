package com.java;

public class FactorialNumber {

	public static void main(String[] args) {
		
		System.out.println(getFactorial(7));
	}
	
	public static int getFactorial(int input){
		
		int res=1;
		int num=input;
		int factorial=0;
		
		while(num!=0){
			res=res*(num);
			num=num-1;
		}
		
		return res;
	}
}
