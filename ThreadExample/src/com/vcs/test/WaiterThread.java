package com.vcs.test;

public class WaiterThread extends Thread {

	private Message message;

	public WaiterThread(Message message) {
		// TODO Auto-generated constructor stub

		this.message = message;
	}

	public void run() {

		System.out.println("waiter waiting " + message.msg);

		synchronized (message) {
			try {
				message.wait();
				System.out.println("notified waiting thread");
			} catch (Exception e) {

				System.out.println("waiter got " + message.msg);
			}

		}
	}

}
