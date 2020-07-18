package com.vcs.core;

public class Thread2 {

	public static void main(String[] args) throws InterruptedException {

		//Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		Thread1 t = new Thread1();
		//t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		//t.join();
		t.yield();

		for (int i = 0; i < 5; i++) {

			System.out.println("kiran");
		}
	}
}
