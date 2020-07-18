package com.java;

import java.util.ArrayList;
import java.util.List;

public class TestExample {

	public static void main(String[] args) {
		System.out.println(returnString("ncgs", "cvhd"));
	}

	public static List<String> returnString(String inp1, String inp2) {

		List<String> res = new ArrayList<String>();
		char[] ch1 = inp1.toCharArray();
		char[] ch2 = inp2.toCharArray();
		int counter = 0;

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if ((ch1[i] + "").equals(ch2[j] + "")) {
					counter = counter + 1;
				}
				
				if (counter > 0) {

				} else {
					sb1.append(ch1[i]);
				}

			}
			

		}
		res.add(sb1.toString());

		return res;
	}
}
