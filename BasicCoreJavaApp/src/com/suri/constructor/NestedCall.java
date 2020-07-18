package com.suri.constructor;

public class NestedCall {

	/**
	 * @param args
	 */
	//StackOverFlow Error
	
	public static void methodOne(){
		methodTwo();
	}
	public static void methodTwo(){
		methodOne();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodOne();
		
		System.out.println("Hello");
	}

}
