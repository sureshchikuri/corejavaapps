package com.java;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAmstrong(153));
	}
	
	public static boolean isAmstrong(int input){
		
		int rem=0;
		int num=input;
		int amstrong=0;
		
		while(num!=0){
			rem=num%10;
			System.out.println("rem=num%10;"+rem);
			amstrong =amstrong+(rem*rem*rem);
			num=num/10;
			System.out.println("num=num/10;;"+num);
		}
		System.out.println(amstrong);
		
		if(amstrong==input)
			return true;
		return false;
		
	}

}
