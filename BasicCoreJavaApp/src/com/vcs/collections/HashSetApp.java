package com.vcs.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> sets = new HashSet<String>();
		sets.add("sri");
		sets.add("kiri");

	
		System.out.println(sets.size());
		System.out.println(sets.contains("sri"));
		System.out.println(sets.hashCode());
		System.out.println(sets.isEmpty());
		//System.out.println(sets.remove("sri"));
		//System.out.println(sets.retainAll(sets));
		System.out.println(sets.size());
		System.out.println(sets.getClass());
		System.out.println(sets.toString());
		//map.clear();

	}

}
