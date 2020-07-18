package com.vcs.countingchar;

public class CountingRepeatedChar {

	public static void main(String[] args) {

		int letter_count=0;
		String word="mathematimcsm";
		String single_letter="";
		
		for(int i=0;i<word.length();i++){
			single_letter=word.substring(i, i+1);
			if(single_letter.equals("m")){
				letter_count++;
			}
		}
		System.out.println("No of m's:"+letter_count);
	}

}
