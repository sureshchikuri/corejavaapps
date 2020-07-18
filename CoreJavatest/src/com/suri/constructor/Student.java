package com.suri.constructor;

public class Student {

	public Student(String name) {
		System.out.println("name:" + name);
	}

	public static void main(String[] args) {
		Student st = new Student("suri");
	}

}
