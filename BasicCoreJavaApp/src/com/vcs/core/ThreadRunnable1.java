package com.vcs.core;

public class ThreadRunnable1 implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<5;i++){
			System.out.println("suresh");
		}
	}
}
