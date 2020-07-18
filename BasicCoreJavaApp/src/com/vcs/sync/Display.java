package com.vcs.sync;

public class Display {

	public synchronized void wish(String name){
		
		for(int i=0;i<3;i++){
			
			System.out.println("good morning");
			try
			{
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}
}
