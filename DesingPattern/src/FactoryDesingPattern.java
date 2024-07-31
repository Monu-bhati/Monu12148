interface Bank{
	public void ROI(double rate);
	
}
class BOI implements Bank{

	@Override
	public void ROI(double rate) {
		System.out.println("Rate of Interest of BOI:"+rate);
		
	}
	
}

class BOB implements Bank{

	@Override
	public void ROI(double rate) {
		System.out.println("Rate of Interest of BOB:"+rate);
		
	}
	
}

class HDFC implements Bank{

	@Override
	public void ROI(double rate) {
		System.out.println("Rate of Interest of HDFC:"+rate);
		
	}
	
}
public class FactoryDesingPattern {

	public static void main(String[] args) {
		Bank b1,b2,b3;
		b1=new BOI();
		b2=new BOB();
		b3=new HDFC();
		b1.ROI(7.6);
		b2.ROI(8.0);
		b3.ROI(6.75);
		

	}

}
