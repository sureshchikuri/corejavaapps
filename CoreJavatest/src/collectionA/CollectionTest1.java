package collectionA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrlist= new ArrayList<String>();
		  arrlist.add("Apple");
		  arrlist.add("Banana");
		  arrlist.add("Mango");
		  arrlist.add("Pear");

		  /*ArrayList to Array Conversion */
		  String array[] = new String[arrlist.size()];              
		  for(int j =0;j<arrlist.size();j++){
		    array[j] = arrlist.get(j);
		  }

		  /*Displaying Array elements*/
		  for(String k: array) 
		  {
		  // System.out.println(k); 
			  
			
			}
			if (arrlist.contains("Pear")) {
				System.out.println("true");
				
				
			}else{
				System.out.println("false");
			}
			
		  }
	}

			 
			  
			  
		  
		  	
		
		

	


