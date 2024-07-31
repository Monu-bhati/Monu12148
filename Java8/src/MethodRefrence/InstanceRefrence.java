package MethodRefrence;

interface Menu{
	void CalculateBill();
}

class Menuimpl{
	int price=200 , qty=5 ;
	void Bill() {
		System.out.println("Total Bill:"+(price*qty));
	}
}
public class InstanceRefrence {

	public static void main(String[] args) {
		
		Menuimpl m1= new Menuimpl();
		
		Menu m=m1::Bill;
		m.CalculateBill();
	
		
	
	}

}
