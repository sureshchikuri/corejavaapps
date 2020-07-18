package com.vcs.test;

import java.util.ArrayList;

public class DuplicateNumber {
	
	public static int getSum(ArrayList lnum){
		
		int fsum=0;
		
		for(int i=0;i<lnum.size();i++){
			
			fsum+=(Integer)lnum.get(i);
		}
		
		return fsum;
		
	}
	
	public static int getDuplicate(int rSum,ArrayList num){
		
		int dNum=0;
		
		int n=num.size()-1;
		
		int fsum=n*(n+1)/2;
		
		dNum=rSum-fsum;
		
		return dNum;
		
	}

	public static void main(String[] args) {
		
		int i;
		
		ArrayList lnum = new ArrayList();
		
		for(i=1;i<=100;i++){
			lnum.add(i);
		}
		
		lnum.add(25);
		
		int sum=getSum(lnum);
		
		int dupliate=getDuplicate(sum, lnum);
		
		System.out.println(dupliate);
		
	}

}
