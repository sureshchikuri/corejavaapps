package com.vcs.overriding;

public class Parent {

	public void method1(){
		System.out.println("public");
	}
	
	private void method2(){
		System.out.println("private");
	}
	
	protected void method3(){
		System.out.println("protected");
	}
}
