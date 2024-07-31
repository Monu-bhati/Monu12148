package lecture9;

interface Bank{
	 void GetROI(double rate);
}

class BOI implements Bank{

	@Override
	public void GetROI(double rate) {

		System.out.println("Rate of Intrest of Bank of India: "+rate);
	}
	
	
}
class BOB implements Bank{

	@Override
	public void GetROI(double rate) {

		System.out.println("Rate of Intrest of Bank of Badoda: "+rate);

	}
	
}
public class DynamicMethodDispach {

	public static void main(String[] args) {
		// Dyanamic Method Dispach
		
		Bank b1,b2;
		b1=new BOI();
		b2=new BOB();
		
		b1.GetROI(5.89);
		b2.GetROI(7.9);

	}

}
