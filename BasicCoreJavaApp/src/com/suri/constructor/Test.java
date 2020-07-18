package com.suri.constructor;
class Test {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.hashCode());// 11394033
		
		Child child=new Child("hi");
		Test test=new Test();
		System.out.println(test.hashCode());
		Parent parent=new Child();
		System.out.println(parent.hashCode());
		System.out.println("main method");
	}
}
