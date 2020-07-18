package com.suri.java;

public class CommandLine {
int x;

CommandLine (int y){
	x=y;
}

	public static void main(String args[]) {
		CommandLine t1 = new CommandLine( 10 );
		CommandLine t2 = new CommandLine( 20 );
	      System.out.println(t1.x + " " + t2.x);
	   
	}

}
