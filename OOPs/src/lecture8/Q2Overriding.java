package lecture8;

class Lion{
	void voice(String a) {
		System.out.println("Lion's Voice " + a);
	}
}
class Dog extends Lion{
	void voice(String a) {          
		super.voice("Meow");
		System.out.println("Dog's Voice " + a);
	}
}

class Cat extends Dog{
	void voice(String a) {
		super.voice("bark");
		System.out.println("Cat's Voice " + a);
	}
}


public class Q2Overriding {
	
	public static void main (String [] args) {
		Cat a1 = new Cat();
		a1.voice("Roar");
	}

}
