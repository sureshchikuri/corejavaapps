package sampleB;

public class Clon1 implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Clon1 c = new Clon1();
		Clon1 c1 = (Clon1)c.clone();

	}
	
	public void cricket() {
		System.out.println("kiran");
		
	}

}
