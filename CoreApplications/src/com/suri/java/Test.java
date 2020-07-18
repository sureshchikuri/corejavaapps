package com.suri.java;

public class Test extends Thread {

	
	static String sName ="good";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t=new Test();
		t.nameTest(sName);
		System.out.println(sName);
	}
	private void nameTest(String sName2) {
		// TODO Auto-generated method stub
		
		sName =sName2+"idea";
		start();
	}

	@Override
	public void run() {
		for(int i=0;i<4;i++){
			sName = sName+""+i;
		}
	}
}
