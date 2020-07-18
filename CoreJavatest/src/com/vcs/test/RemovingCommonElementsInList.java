package com.vcs.test;

import java.util.ArrayList;
import java.util.List;

public class RemovingCommonElementsInList {

	public static void main(String[] args) {

		List strings = new ArrayList();
		strings.add("suresh");
		strings.add("kiran");
		strings.add("raju");
		strings.add("sweety");
		strings.add("suresh");
		strings.add("kiran");
		strings.add("mahesh");
		strings.add("sweety");

		int size = strings.size();
		int duplicates = 0;

		// not using a method in the check also speeds up the execution
		// also i must be less that size-1 so that j doesn't
		// throw IndexOutOfBoundsException
		for (int i = 0; i < size - 1; i++) {
			// start from the next item after strings[i]
			// since the ones before are checked
			for (int j = i + 1; j < size; j++) {
				// no need for if ( i == j ) here
				if (!strings.get(j).equals(strings.get(i)))
					continue;
				duplicates++;
				strings.remove(j);
				// decrease j because the array got re-indexed
				j--;
				// decrease the size of the array
				size--;
			} // for j
		} // for i

		System.out.println(strings);
	}

}
