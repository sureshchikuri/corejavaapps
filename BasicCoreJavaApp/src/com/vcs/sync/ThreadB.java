package com.vcs.sync;

public class ThreadB extends Thread {

	int total=0;
	public void run(){
		
		synchronized (this) {
			System.out.println("child class method starts calculation");
			{
				for(int i=0;i<10;i++){
					total+=i;
				}
			}
			System.out.println("this is child class method calls notify()");
			this.notify();
		}
	}
}
