package com.vcs.collections;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorApp {

	public static void main(String[] args) {
		
		Vector<String> newVector=new Vector<String>();
		
		newVector.add("suri");
		newVector.add("kiri");
		newVector.add("vcs");
		
		//newVector.remove("kiri");
		
		ListIterator<String> litr=newVector.listIterator();
		String student=null;
		
		while (litr.hasNext()) {
			student=litr.next();
			if (student.equals("vcs")) {
				litr.remove();
				System.out.println("true");
			}
			System.out.println("Student:"+student);
		}
		
		System.out.println(newVector.toString());
		
		while (litr.hasNext()) {
			student=litr.next();
			System.out.println(student);
		}
	}
}
