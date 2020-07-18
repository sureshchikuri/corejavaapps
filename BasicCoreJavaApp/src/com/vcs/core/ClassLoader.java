package com.vcs.core;

import junit.framework.Test;

public class ClassLoader {

	public static void main(String[] args) {

		System.out.println(String.class.getClassLoader());
		System.out.println(Test.class.getClassLoader());
		System.out.println(ClassLoader.class.getClassLoader());
	}

}
