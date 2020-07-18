package sampleB;

import java.util.ArrayList;
import java.util.List;

public class Operations  implements OperationInterface{
	
	   List l= new ArrayList();
	
	public void addCustomer(Customer customer){
		//List l = new ArrayList<>();
		l.add(customer);
		show(l);
	}
	
   public void updateCustomer(Customer customer){
	  // List l = new ArrayList<>();
	   customer.setAddress(customer.getAddress());
	   l.add(customer);
	   show(l);
   }
   
   public void deleteCustomer(int id){
	   
	
	   l.remove(id);
	   show(l);

   }
   
   void  show(List l){
	   System.out.println(l);
	   
}
   
}