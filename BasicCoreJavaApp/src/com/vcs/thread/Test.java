package com.vcs.thread;

public class Test extends Thread{

	public void run(){
		
		System.out.println("test suresh");
	}
	
	public static void main(String[] args) throws Exception {
		
		Test test=new Test();
		test.start();
		//Thread.sleep(1000);
		{
			if(true){
				System.out.println("hai");
			}
		}
	}
}
