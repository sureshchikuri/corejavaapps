package com.vcs.overloading;

public class Childs extends Parent {
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("vicky");
	} 
	
	public void method4(){
		System.out.println("method4");
	}

	public static void main(String[] args) {
		
		//Parent parent=new Parent();
	 	//parent.method3();
		
		//if any class extends parent and if obj is created for child.we can call parent class methods also
		//Childs childs=new Childs();
		//childs.method2();
		
		//if method is present in both parent and child and if we create object for child class with parent reference,it will execute child class method
		//if ti is not present in child it will check in parent class
		//polyMorphism
		Parent parent=new Childs();
		parent.method4();
	}
}
