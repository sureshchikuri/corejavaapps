package com.suri.constructor;

abstract class Parent {
	
	Parent(String s) {
		
		System.out.println(this.hashCode());// 11394033//here this means child
											// class object
	System.out.println("Parent arg const");
	}
	
	 Parent() {
		 
		 super();
		 System.out.println("No arg Const");
	}
}



