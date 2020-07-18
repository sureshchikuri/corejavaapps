package com.vcs.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put("suri", "sri");
		map.put("kiran", "kiri");
		

		Map<String, String> newMap = new HashMap<String, String>();

		System.out.println(map.containsKey("suri"));
		System.out.println(map.isEmpty());
		System.out.println(map.containsValue("sri"));
		System.out.println(map.equals(newMap));
		System.out.println(map.get("suri"));
		System.out.println(map.size());
		//System.out.println(map.remove("suri"));
		System.out.println(map.getClass());
		System.out.println(map.keySet());
		System.out.println(map.values());
		//map.clear();

	}


}
