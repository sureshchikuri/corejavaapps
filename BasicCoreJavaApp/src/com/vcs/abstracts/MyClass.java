package com.vcs.abstracts;

public class MyClass extends MyAbstract {

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void method4() {
		// TODO Auto-generated method stub
		super.method4();
		//method hiding
		
		System.out.println("kiran");
	}

	public static void main(String[] args) {
		
		MyClass c=new MyClass();
		
		c.method4();
	}
}
