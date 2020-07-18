package sampleB;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("kiran");
		c.setMobilephoneno(984);
		c.setAddress("hyd");
		
		Operations o = new Operations();
		o.addCustomer(c);
		o.updateCustomer(c);
		o.deleteCustomer(1);
		
		

	}

}
