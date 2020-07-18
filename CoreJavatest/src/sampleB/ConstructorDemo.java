package sampleB;

public class ConstructorDemo {
	int rollno;
	String name;
	
	
	 ConstructorDemo(String name, int rollno){
		 this.name=name;
		 this.rollno=rollno;
	 }

		
		public static void main(String[] args){
			
			ConstructorDemo d = new ConstructorDemo("kian", 779);
			ConstructorDemo d1 = new ConstructorDemo("suresh", 2999);
	        System.out.println(d.rollno+"---"+d.name+"---"+d1.rollno+"--"+d1.name);
			
			
			
			
		}
}
