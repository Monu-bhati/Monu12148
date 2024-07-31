package DefaultMethod;

interface Animal{
	void eat();
	default void bark() {
		System.out.println("Animal is Barking");
	}
}


public class Demo1 {

	public static void main(String[] args) {
		
		Animal a1=()->System.out.println("Animal is Eating");
		a1.bark();
		a1.eat();
		

	}

}