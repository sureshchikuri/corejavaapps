package com.suri.constructor;

public class Employee {

	public int sal;

	private String name;

	public Employee(String empName) {
		name = empName;
		System.out.println("name:" + name);
	}

	public void sal(int empSal) {
		sal = empSal;
	}

	public void print() {
		System.out.println("empsal:" + sal);
		System.out.println("empname:" + name);
	}

	public static void main(String[] args) {
		Employee emp = new Employee("suri");
		emp.sal(10);
		emp.print();
	}

}
