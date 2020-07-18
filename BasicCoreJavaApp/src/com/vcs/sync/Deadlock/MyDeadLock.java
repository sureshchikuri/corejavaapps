package com.vcs.sync.Deadlock;

import com.vcs.sync.ThreadB;

public class MyDeadLock extends Thread {

	A a=new A();
	B b=new B();
	
	MyDeadLock(){
		
		Thread t=new Thread();
		t.start();
		a.first(b);//main
	}
	
	public void run(){
		
		b.second(a);//child
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyDeadLock();//main
		
	}

}
