package sampleB;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("suresh");
		String s1= new String("kiran");
		
		//System.out.println(s==s1);
		
		String s3 = "suresh";
		//System.out.println(s==s3);
		String s4 = "suresh";
		//System.out.println(s3==s4);
		String s5 =s4.intern();
       // System.out.println(s4==s5);
        
       String s6 = s4.concat("cricket");
       //String s7 = new String ("sureshcricket");
      // System.out.println(s6);
       String s8=s6.toString();
       //System.out.println(s6.charAt(7));
    		   //System.out.println(s6.contains(s4));
      // System.out.println(s6.contentEquals(s1));
      // System.out.println(s6.endsWith(s1));
       //System.out.println(s6.compareTo(s1));
    	//System.out.println(s6.equalsIgnoreCase(s1));	   
    		//System.out.println(s6.substring(0)); 
    		//System.out.println(s6.substring(3, 5));
      // System.out.println(s6.length());
      //System.out.println(s6.replace('s', 'k'));
       System.out.println(s6==s8);
       
       
       
       
       
       
    		 
    		  
	}

}
