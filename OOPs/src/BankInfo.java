interface BOI{
	void ShowROI(double rate);
}

interface BOB{
	void ShowROI(double rate);
}
class Info implements BOI,BOB{

	

	@Override
	public void ShowROI(double rate) {
		System.out.println("Rate of intrest of the bank "+rate);
		
	}
	
}
public class BankInfo {

	public static void main(String[] args) {
		

	}

}
