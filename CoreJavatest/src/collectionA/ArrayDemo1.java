package collectionA;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List l = new ArrayList(); l.add(3); l.add(4); l.add(5);
		 * System.out.println(); Object[] a = l.toArray(); for (Object o : a) {
		 * 
		 * System.out.println(o); System.out.println(o.getClass().getName());
		 * 
		 * } System.out.println(a.getClass().getName());
		 * System.out.println(l.getClass().getName());
		 */

		/*
		 * Set set=new HashSet<>(); set.add(4); set.add(2); set.add(7);
		 * set.add(1);
		 */

		/*
		 * Set set = new TreeSet(); set.add(4); set.add(2); set.add(7);
		 * set.add(1);
		 * 
		 * Iterator itr = set.iterator();
		 * 
		 * while (itr.hasNext()) { int i = (int) itr.next();
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */

		int[] a = new int[5];
		a[0] = 2;
		a[1] = 4;
		a[2] = 3;
		a[3] = 1;
		a[4] = 5;

		int temp = 0;
		for (int i = 1; i < a.length; i++) {

			for (int j = i; j > 0; j--) {

				if (a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;

				}

			}

		}

		for (int c : a) {
			System.out.println(c);
		}
	}
}
