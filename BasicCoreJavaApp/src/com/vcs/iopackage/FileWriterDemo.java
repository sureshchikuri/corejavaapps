package com.vcs.iopackage;

import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("cricket.txt", true);
		fw.write(98);// adding a single character
		fw.write("suresh\nsoftware solutions");
		fw.write("\n");
		char[] ch = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.write("\n");
		//fw.flush();
		fw.close();
	}
}
