package sampleB;

public class Student1 {
	
//t0string method//Teststudent&
	
	private int rollno;
	private String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
         this.rollno=rollno;
	}
   public String getName(){
	   return name;
	   
   }
   public void setName(String name){
	   this.name=name;
   }

@Override
public String toString() {
	return "Student1 [rollno=" + rollno + ", name=" + name + "]";
}
 
   
   
}
   
   
   
   
