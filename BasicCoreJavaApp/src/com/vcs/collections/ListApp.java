package com.vcs.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListApp {

	
	public static void main(String[] args) {

		
		List<String> newList=new ArrayList<String>();
		newList.add("suri");
		newList.add("kiri");
		newList.add("vcs");
		
		Iterator<String> itr=newList.iterator();
		String student=null;
		
		while (itr.hasNext()) {

			student=itr.next();
			System.out.println("Student:"+student);
		}
	}

}
