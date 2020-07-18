package com.vcs.test;

public class Ex2 extends Thread{

	@Override
	public void run() {
		System.out.println("run");
	}
	
	public static void main(String[] args) {

		Ex2 ex=new Ex2();
		Thread t= new  Thread(ex);
		t.run();
	}

}
