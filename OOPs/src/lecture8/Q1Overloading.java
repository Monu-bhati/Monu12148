package lecture8;

public class Q1Overloading {
	
	void Function1(int a,int b) {
		System.out.println("Addition of numbers " + (a+b));
	}
	
	void Function1(int a,int b,int c) {
		System.out.println("Subtrcation of numbers " + (a-b-c));
	}
	
	void Function1(int a,int b,int c,int d) {
		System.out.println("Multiplcation of numbers " + (a*b + c*d));
	}
	void Function1(int a){
		System.out.println("Division of numbers " + (a/2));
	}
	public static void main(String[] args) {
		Q1Overloading o1 = new Q1Overloading();
		o1.Function1(5, 9);
		o1.Function1(4, 0 ,5);
		o1.Function1(6);
		o1.Function1(3, 2, 4, 2);

	}

}
