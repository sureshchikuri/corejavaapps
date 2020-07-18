package com.suri.java;

import java.util.LinkedList;

public class RemovingDupliates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemovingDupliates rd = new RemovingDupliates();
		
		Integer eachNo = 0;
		
		int count = 0;
		int totDuplicates = 0;
		

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(2);
		ll.add(5);
		
		for (int i = 0; i < ll.size(); i++) {
			
			eachNo = ll.get(i);
			
			if(eachNo!=null){
				
				count = rd.getCountOfDuplicates(eachNo,ll);
				
				if(count>0){
				ll.remove(i);
				totDuplicates++;
				System.out.println("Dupliate Num :"+eachNo +"  Count :"+count);
				}
			}
		}
		System.out.println("totDuplicates :"+totDuplicates);
	}

	private int getCountOfDuplicates(Integer eachNo, LinkedList<Integer> ll) {
		// TODO Auto-generated method stub
		
		int req= 0;
		int counter =0;
		
		for (int i = 0; i < ll.size(); i++) {
			
			req = ll.get(i);
			
			if(eachNo == req){
				counter++;
			}
		}
		if(counter<2){
			return 0;
		}else{
		return counter;
		}
	}

}
