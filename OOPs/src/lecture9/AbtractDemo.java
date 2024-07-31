package lecture9;
abstract class Capgemini{
	String addraess="Aroli";
	
	void disp() {
		System.out.println("This is Display Method");
	}
	
	abstract void show();
}

class cg extends Capgemini {


	void show() {
		System.out.println("This is Show Method");
	}
}
public class AbtractDemo {

	public static void main(String[] args) {
		cg c1 = new cg();
		System.out.println(c1.addraess);
		c1.disp();
		c1.show();

	}

}
