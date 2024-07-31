package lecture8;

public class PolmorephismOverLoading {

	
		
		void add(int a,int b) {
			System.out.println("add 2 numbers: " + (a+b));
		}
		
		void add(int a,int b,int c) {
			System.out.println("add 3 numbers: " + (a+b+c));
		}
		void add(String a,String b) {
			System.out.println("String Concat: " + (a+b));
		}
	
	public static void main(String[] args) {

		PolmorephismOverLoading o = new PolmorephismOverLoading();
		o.add(5, 6);
		o.add(2, 5, 10);
		o.add("Monu ", "Bhati");
	
	}

}
