package com.vcs.sync;

public class SynchronizedDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display=new Display();
		MyThread myThread=new MyThread(display,"sachin");
		MyThread myThread2=new MyThread(display,"yuvi");
		myThread.start();
		myThread2.start();
	}

}
