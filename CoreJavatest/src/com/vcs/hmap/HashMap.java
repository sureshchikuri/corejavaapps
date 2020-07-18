package com.vcs.hmap;

import java.util.*;

public class HashMap {

	public static void main(String[] args) {
		MapLogic map = new MapLogic();
		map.put("99", "suresh");
		map.put("89", "sandhya");
		map.put("90", "raju");
		map.put("80", "jakka");
		String str =(String) map.get("99");
		System.out.println("Object value:"+str);
	}
}

class MapLogic {
	Entry[] table = new Entry[16];

	public void put(Object key, Object value) {
		int index = key.hashCode() & 15;
		for (Entry newEntry = table[index]; newEntry != null; newEntry = newEntry.next) {
			if (newEntry.key == key)
				newEntry.value = value;
		}
		Entry oldEntry = table[index];
		table[index] = new Entry(key, value, oldEntry);
	}

	public Object get(Object key) {
		int index = key.hashCode() & 15;
		for (Entry entry = table[index]; entry != null; entry = entry.next) {
			if (entry.key == key)
				return entry.value;
		}
		return null;
	}
}

class Entry {
	Object key;
	Object value;
	static Entry next;

	public Entry(Object key, Object value, Entry e) {
		this.key = key;
		this.value = value;
		this.next = e;
	}
}