package com.vcs.core;

public class ThreadRunnableDemo {

	public static void main(String[] args) {
		
		ThreadRunnable1 tr=new ThreadRunnable1();
		Thread t = new Thread(tr);
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("kiran");
		}
	}

}
