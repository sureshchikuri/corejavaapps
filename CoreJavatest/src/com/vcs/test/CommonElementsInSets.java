package com.vcs.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonElementsInSets {

	public static void main(String[] args) {

		Set<String> s1 = new HashSet<String>();
		s1.add("suresh");
		s1.add("kiran");
		s1.add("raju");
		s1.add("sweety");

		Set<String> s2 = new HashSet<String>();
		s2.add("suresh");
		s2.add("mahesh");
		s2.add("raju");
		s2.add("lucky");

		Iterator<String> itr1 = s1.iterator();
		String sr = null;
		Iterator<String> itr2 = s2.iterator();
		String sp = null;
		while (itr1.hasNext()) {
			sr = itr1.next();
			while (itr2.hasNext()) {
				sp = itr2.next();
			}
			if (sr.equals(sp)) {
				System.out.println(sr);
			}
		}

	}

}
