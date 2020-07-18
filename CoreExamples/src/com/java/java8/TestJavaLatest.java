package com.java.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJavaLatest {

	public static void main(String[] args) {
		
		/*Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((k,v)-> {System.out.println("key "+k+" value "+v);
		
		if("E".equals(k)){
			System.out.println(v);
		}
		});
		*/
		List<String> items = new ArrayList<>();
		items.add("G");
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		//lambda
		//Output : A,B,C,D,E
		/*items.forEach(item->{System.out.println(item);
		
			if(item.equals("E")){
				System.out.println(item);
			}
		});*/
		
		items.stream().forEachOrdered(System.out::println);
		
		int i=10;
		int p=111;
		int r=0x11;
		
		System.out.println("i "+i+"p "+p+"r "+r);
		
		
			
	}

}
