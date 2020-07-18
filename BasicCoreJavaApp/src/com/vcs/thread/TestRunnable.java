package com.vcs.thread;

public class TestRunnable implements Runnable{

	/**
	 * @param args
	 */
	
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("kiran");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestRunnable testRunnable=new TestRunnable();
		Thread t = new Thread(testRunnable);
		t.start();
	}

}
