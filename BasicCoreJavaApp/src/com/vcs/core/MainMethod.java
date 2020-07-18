package com.vcs.core;

public class MainMethod {

	public static void main(String[] args) {

		System.out.println("main method");
		System.out.println("Length :" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

	public static void main(int[] args) {

		System.out.println("second method");
	}
}

class MyMethod {

	int i = 0;
	String s = "suri";

	public static void main(String[] args) {
	
		MainMethod.main(new String[]{null});
		MainMethod.main(new int[]{1,2});
	}

}