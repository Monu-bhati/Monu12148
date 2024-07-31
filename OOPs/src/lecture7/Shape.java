package lecture7;
class Cricle{
	
	int r = 10;
	public void cArea() {
		System.out.println("Area of Cricle:" + (3.14*r*r));
	}
}

class Rectangle{
	
	int l=5;
	int b=10;
	
	public void rArea() {
		System.out.println("Area of Rectangle:" + (l*b));
	}
}
public class Shape {

	public static void main(String[] args) {
		Cricle c = new Cricle();
		c.cArea();
		
		Rectangle r = new Rectangle();
		r.rArea();

	}

}
