package com.vcs.thread;

 class ThreadDemo extends MyThread{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread myThread=new MyThread();
		myThread.start();
		myThread.interrupt();
		try {
			//myThread.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=3;i++){
			System.out.println("kiran");
		}
	}

}
