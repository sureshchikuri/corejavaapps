package com.suri.constructor;

public class Job {

	private int id;
	private int salary;
	
	Job(int salary,int id){
		//this.id=id;
		//this.salary=salary;
		System.out.println(" Salary: " + salary + " Id: " +id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Job j=new Job(10000, 11);
	}

}
