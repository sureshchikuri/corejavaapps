package com.suri.constructor;

public class ConstructorRecursive {

	/**
	 * @param args
	 */
	//Recursive Constructor Invocation
	ConstructorRecursive(int i){
		//this();
	}
	ConstructorRecursive(){
		this(10);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
	}

}
