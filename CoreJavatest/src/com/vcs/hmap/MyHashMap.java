package com.vcs.hmap;

import java.util.*;

public class MyHashMap {

	
	public static void main(String[] args) {
		Map hm = (Map) new HashMap();
		hm.put(1, "suresh");
		hm.put(2, "kiran");
		hm.put(3, "sandhya");
		hm.put(4, "sravan");
		/*Set set = hm.entrySet();
		System.out.println("values:"+set);*/
		/*String val=(String)hm.get(2);
		System.out.println("values:"+val);*/
		boolean v=hm.containsKey(3);
		System.out.println("boolean value:"+v);

	}

}
