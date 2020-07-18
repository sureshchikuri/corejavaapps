package com.suri.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Properties dbprops = new Properties();
		
		//dbprops.load(FileReading.class.getClassLoader().getResourceAsStream(("dbProperties.properties")));
		
		dbprops.load(new FileInputStream("E:/MyEclipse/CoreApplications/src/dbProperties.properties"));
		
		System.out.println(dbprops.getProperty("user"));
	}

}
