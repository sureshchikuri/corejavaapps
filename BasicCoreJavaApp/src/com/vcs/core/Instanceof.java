package com.vcs.core;

public class Instanceof {

	
	public static void main(String[] args) {

		Thread1 t1=new Thread1();
		
		System.out.println(t1 instanceof Thread1);
		System.out.println(t1 instanceof Object);
		System.out.println(t1 instanceof Runnable);
		System.out.println(t1 instanceof Thread);
		System.out.println(t1.getClass().getName());
	}

}
