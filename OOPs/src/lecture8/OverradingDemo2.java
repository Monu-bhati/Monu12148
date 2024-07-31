package lecture8;

class BOI{
	void getROI(double rate) {
		System.out.println("Rate of interest of Bank of India is " + rate + "%");
	}
}

class BOB extends BOI{
	void getROI(double rate) {
		super.getROI(7.0);
		System.out.println("Rate of interest of Bank of Badodra is " + rate + "%");
	}
}

class HDFC extends BOB{
	void getROI(double rate) {
		super.getROI(6.7);
		System.out.println("Rate of interest of HDFC is " + rate + "%");
	}
}
public class OverradingDemo2 {

	public static void main(String[] args) {
		HDFC h1 = new HDFC();
		h1.getROI(8.9);

	}

}
