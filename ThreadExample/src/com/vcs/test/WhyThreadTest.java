package com.vcs.test;

public class WhyThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Message message = new Message();

		Thread t1 = new WaiterThread(message);

		message.msg = "plz give the order";

		Thread t2 = new NotifyThread(message);

		t1.start();

		t2.start();

	}

}
