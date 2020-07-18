package com.vcs.sync;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b=new ThreadB();
		b.start();
		synchronized (b) {
			
		//	System.out.println("this is main method calls wait()");
			b.wait();
			//System.out.println("this method gets notification");
			System.out.println(b.total);
		}
	}
}
