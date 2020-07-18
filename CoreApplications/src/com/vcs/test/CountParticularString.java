package com.vcs.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountParticularString {

	public static void main(String[] args) {
		
		String in = "HIS(Health Insurance System) Application will be implemented as a product " +
        		"which will be useful various companies offering Health Insurance .Once Customer takes the Health " +
        		"Insurance ,we can add all information about customer including personal, insurance details etc. " +
        		"Customer premium details will be stored in HIS and then will be tracked. When customer gets the " +
        		"health problem and joined in the hospital, then customer should collect all the bills and submit to" +
        		" Company. Later company people will verify the details whether it is correct or not and then enter" +
        		" the verification details into the HIS. " +
        		"Credit manager verifies and then sanctions the amount for customers.";
		int i = 0;
		Pattern p = Pattern.compile("er");
		Matcher m = p.matcher( in );
		while (m.find()) {
		    i++;
		}
		
		System.out.println(i);
	}
	
}
