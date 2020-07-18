package com.vcs.overloading;

public class Parent {
	
	public void method1(){
		System.out.println("suresh");
	}
	
	public void method2(){
		System.out.println("kiran");
	}

	public void method3(){
		
		method4();
		
		System.out.println("hai");
	}

	protected void method4() {
		// TODO Auto-generated method stub
		
	}
}
