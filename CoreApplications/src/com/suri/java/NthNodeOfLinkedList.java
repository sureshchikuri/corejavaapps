package com.suri.java;

import java.util.LinkedList;

public class NthNodeOfLinkedList {

	
	public static void main(String[] args) {
		
		int num = 0;
		
		int inp =3;
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(2);
		
		for(int i=0;i<ll.size();i++){
			
			if((i+1)==inp){
				num =i+2;
			}
		
		}
		
		System.out.println(num);
		
	}
}
