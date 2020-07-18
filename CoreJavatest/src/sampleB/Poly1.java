package sampleB;

public class Poly1 {
	public static void main(String[] args){
		
		Poly2 [] b = new Poly2[2];
	 
		b [0]= new Poly3();
		b[1] = new Poly4();
		
		
		for (int i = 0; i < 2; i++) {
			b[i].cricket();
			
			
		}
	}
}
