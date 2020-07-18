package com.suri.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class B implements Serializable {

	public static void main(String[] args) throws IOException {
		
		B b=new B();
		
		FileOutputStream fs = new FileOutputStream("b.ser");
		
		ObjectOutputStream os=new ObjectOutputStream(fs);
		
		os.writeObject(b);
		os.close();
		
		
		
		NavigableMap<Integer,String> navMap=new ConcurrentSkipListMap<Integer,String>();
		
		navMap.put(1, "April");
		navMap.put(2, "MAY");
		navMap.put(3, "june");
		navMap.put(4, "july");
		
		navMap.pollFirstEntry();
		navMap.pollLastEntry();
		
		System.out.println(navMap.size());
		System.out.println(navMap);
		
	}
}
