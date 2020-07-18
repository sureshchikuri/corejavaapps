package com.suri.constructor;

public class TestForNoOfObj {

	/**
	 * @param args
	 */
	
	static int count=0;
	{
		count++;
	}
	
	 TestForNoOfObj() {
	}
	 TestForNoOfObj(int i) {
		}
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestForNoOfObj t1=new TestForNoOfObj();
		TestForNoOfObj t2=new TestForNoOfObj(10);
		TestForNoOfObj t3=new TestForNoOfObj();
		
		System.out.println(count);
	}

}
