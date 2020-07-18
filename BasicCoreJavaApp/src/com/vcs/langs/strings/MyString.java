package com.vcs.langs.strings;

public class MyString {
	
	static int id;
	static String name;

	public MyString(int id,String name) {

		this.id= id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MyString  myString=new MyString(11, "suri");
		
		System.out.println(MyString.id +" "+ MyString.name );
	}

	
	/*public void display(){
		System.out.println(MyString.id +" "+ MyString.name );
	}*/
}
