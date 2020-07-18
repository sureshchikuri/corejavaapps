package com.vcs.test;

public class NotifyThread extends Thread {

	private Message message;

	public NotifyThread(Message message) {
		// TODO Auto-generated constructor stub

		this.message = message;
	}

	public void run() {
		
		System.out.println("notify thread ");
		try {

			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		synchronized (message) {

			message.msg = ">> order";

			message.notify();// testing
		}
	}
}
