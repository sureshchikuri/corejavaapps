package com.vcs.core;

public class NewKey {
	
	public NewKey() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {

		//Object o=Class.forName("NewKey").newInstance();
		//System.out.println("Object Created:"+o.getClass().getName());
		
		NewKey key=(NewKey) Class.forName("NewKey").newInstance();
		System.out.println(key.hashCode());
	}

}
