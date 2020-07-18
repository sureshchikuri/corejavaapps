package com.vcs.sync.Deadlock;

public class A {

	public synchronized void first(B b){
		
		System.out.println("here first method execution starts");
		
		try {
			wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("class A trying to call class B methodtwo");
		b.methodTwo();
	}
	public synchronized void methodOne(){
		System.out.println("this is method1");
	}
}
 class B {

	public synchronized void second(A a){
			
			System.out.println("here second method execution starts");
			
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("class B trying to call class A methodone");
			a.methodOne();
		}
		public synchronized void methodTwo(){
			// TODO Auto-generated method stub
			System.out.println("this is method2");
		}
	}
