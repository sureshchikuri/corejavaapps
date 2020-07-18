package collectionA;

import java.util.ArrayList;
import java.util.List;

public class CollectionsA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new ArrayList();
		l.add(7);
		l.add(8);
		l.add("kiran");
		l.add(9);
		l.add(2, "suresh");
		l.remove(2);

		List l1 = new ArrayList();
		System.out.println(l1.add("cri"));
		l1.add("ten");
		l1.add(1);
		l1.add(2);

		l.addAll(l1);

		// Object[] o1 = l.toArray();
		// System.out.println(o1);

		// System.out.println(l);
		// for ( Object o:l) {

		// System.out.println(o);
		// }
		
		//System.out.println(l.addAll(l1));
		
		//System.out.println(l.get(1));
		//System.out.println(l.contains(7));

		Object array[] = new Object[l.size()];
		for (int i = 0; i < l.size(); i++) {

			array[i] = l.get(i);
			System.out.println(array[i]);

			
			//System.out.println(l.contains(7));
			
			
			array[i]= l.set(3, "parnika");
			//System.out.println(array[i]);
			
			array[i]= l.equals(l1);
			//System.out.println(array[i]);
			
					
			
		}

	}

}
