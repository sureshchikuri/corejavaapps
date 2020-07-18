package com.vcs.core;

public class Engine {
	
	public void display(){
		
		System.out.println("engine");
	}
}
 class Car extends Engine{

	 //this is  has-a relationship is also called as aggregation
		 Engine e=new Engine();
	 
 }