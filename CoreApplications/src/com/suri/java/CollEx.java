package com.suri.java;

import java.util.Arrays;
import java.util.Collection;

public class CollEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[]={"orange","mango","guava"};
		Collection c=Arrays.asList(str);
		c.add("grape");
		
		System.out.println("iems"+c);
	}

}
