package com.vcs.core;

import java.util.ArrayList;
import java.util.List;


public class ParentChildReference {

	@SuppressWarnings("unchecked")
	public Object Lists(){
	List l=new ArrayList();
		
		l.add("suresh");
		l.add(123);
		l.add(12.2);
		
		return l;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ParentChildReference pc=new ParentChildReference();
	
	Object o= pc.Lists();
	System.out.println(o);
	}
	
}
