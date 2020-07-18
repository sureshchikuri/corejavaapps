package com.vcs.java;

public class TestSample {
	
	/*public static int sum(){
		int a=10;
		int b=20;
		
		int c=a+b;
		
		//System.out.println(c);
		return c;
	}*/
	
	public TestSample() {
		// TODO Auto-generated constructor stub
		
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Interf1 i=()->{return 20;};
		//i.add();
		
		Interf1 i2=TestSample::new;
		TestSample t=i2.get();
		
		System.out.println(t);
	}

}
