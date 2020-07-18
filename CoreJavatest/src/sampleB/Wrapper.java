package sampleB;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		
		Integer i1 = Integer.valueOf("100", 2);// specified radix string form to wrapper object
		
		int i3 = Integer.parseInt("100", 4);//specified radix string form to corresponding primitive
		
		int i2 = Integer.parseInt("10");// changing string to respective types(original)
		
		boolean b = Boolean.parseBoolean("True");//" "
		
		Integer i4 = new Integer(5);// to string 
		
		
	    String  s1 = Integer.toString(50);// use String type variable for toString method
		String  s2 = Boolean.toString(false);
		
		
		
		String s3 = Integer.toString(7, 2);// primitive to corresponding string form
		//System.out.println(s3);
		
		String s4 = Integer.toBinaryString(7);//to convert wrapper object or primitive to String 
		                                      //tobinarystring, tohexastring methods
		
		System.out.println(s4);
		
		
		
		
		
		
		
		//System.out.println(i1);
		
		//System.out.println(i3);
		//System.out.println(i2);
		//System.out.println(b);
		//System.out.println(i4.toString());
        //System.out.println(s2);		
		
		
		
	}

}
