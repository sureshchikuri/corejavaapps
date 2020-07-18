package sampleB;

public class WrapperClassDemo {

	public static void main(String[] args) throws Exception {

		int i = 10;//primitive

		Integer i1 = Integer.valueOf(i); // primitive type to Object type conversion

		int i2 = i1.intValue(); // Object type to primitive type conversion
		
		
		
		Boolean b = Boolean.valueOf(false);
		 boolean b2 =b.booleanValue();
		 Boolean b1 = Boolean.valueOf(b2);
		boolean b3 = b1.booleanValue();

		Character ch = new Character('k');
		
		char c1 = ch.charValue();
		Character ch1 = Character.valueOf(c1);
		char c2 = ch1.charValue();
		
		Double d = Double.valueOf(i);
		double d1 =d.doubleValue();
		Double d2 = Double.valueOf(d1);
		
		
		float f =  5.5f;
	    Float f1 = Float.valueOf(f);
	    float f2 = f1.floatValue();

		// System.out.println(i);
		// System.out.println(d);
		// System.out.println(i2);
		// System.out.println(b);
		// System.out.println(c1);
		// System.out.println(d);
		// System.out.println(d1);
		// System.out.println(f);
		// System.out.println(b1);
		//System.out.println(b2);
         System.out.println(f1);
         System.out.println(f2);
	}

}
