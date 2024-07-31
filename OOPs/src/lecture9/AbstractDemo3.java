package lecture9;

abstract class Shapes{
	 
	abstract void show();
	
}
abstract class Triangle{
	
	abstract void show();
}

class Square extends Shapes{
	
	void show() {
		System.out.println("This is Show metl");
	}
}

class Rectangle extends Triangle{
	
	void show() {
		System.out.println("This is Show ");
	}
}
public class AbstractDemo3 {

	public static void main(String[] args) {
		Square s1 = new Square();
		Rectangle r1 = new Rectangle();
		s1.show();
		r1.show();
		
	}

}
