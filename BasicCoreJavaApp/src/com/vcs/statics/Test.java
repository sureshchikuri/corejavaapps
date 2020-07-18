package com.vcs.statics;

public class Test {

	static int i=methodOne();
	
	/*static Test t=new Test();
	
	Test(){
		System.out.println("test");
	}*/
	
/*static Test t=new Test();
	
	{
		System.out.println("test");
	}*/
	
	public static int methodOne(){
		
		System.out.println("hai suresh");
		System.exit(0);
		return 10;
	}
}
