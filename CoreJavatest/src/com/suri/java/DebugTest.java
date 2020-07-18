package com.suri.java;

public class DebugTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=4;int b=4;
System.out.println("Break point-f5");
add(a,b);
System.out.println("Break point-f5");
sub(a,b);
System.out.println("Break point-f8");
System.out.println("success");
System.out.println("Break point-watch expression->Add(a*b)->f8");
	}

	private static void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	private static void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
