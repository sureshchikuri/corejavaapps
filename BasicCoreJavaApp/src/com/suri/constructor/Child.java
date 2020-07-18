package com.suri.constructor;
class Child extends Parent {
	
	String s;
	
	Child() {
		super();
		//System.out.println(this.hashCode());// 11394033
		System.out.println("child const");
	}
	
	Child(String s){
		super(s);
		System.out.println("Child Arg Constructor");
	}
}