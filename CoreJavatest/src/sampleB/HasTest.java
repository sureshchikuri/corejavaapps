package sampleB;

public class HasTest {
	
	int i;;
	
	HasTest(int i){
	this.i=i;
		
	}
	
	
	
	

	@Override
	public int hashCode() { 
		
		
		return i;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasTest t = new HasTest(5);
		System.out.println(t.hashCode());
		HasTest t1 = new HasTest(8);
		System.out.println(t1.hashCode());
		
		HasTest2 h = new HasTest2();
		System.out.println(h.hashCode());
		t.cricket();
		System.out.println(t);
		
		}
public void cricket(){
	System.out.println("cricket");
}
	}


