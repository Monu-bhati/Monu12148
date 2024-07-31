package lecture7;
class Cricle1{
	
	int r = 10;
	public void cArea() {
		System.out.println("Area of Cricle:" + (3.14*r*r));
	}
}

class Rectangle1 extends Cricle1{
	
	int l=5;
	int b=10;
	
	public void rArea() {
		System.out.println("Area of Rectangle:" + (l*b));
	}
}
public class Shape2 {

	public static void main(String[] args) {
		
		Rectangle1  r = new Rectangle1();
		r.cArea();
		r.rArea();

	}

}
