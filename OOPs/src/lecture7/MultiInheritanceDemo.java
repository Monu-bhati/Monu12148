package lecture7;
class Animal{
	void eat() {
		System.out.println("Eating..");
	}
}

class Dog extends Animal{
	void brak() {
		System.out.println("Brakking..");
	}
}

class Cat extends Dog{
	void meow() {
		System.out.println("meow meow..");
	}
}

class Kitten extends Cat{
	void beep() {
		System.out.println("Beeping..");
	}
}
public class MultiInheritanceDemo {

	public static void main(String[] args) {
		Kitten k = new Kitten();
		
		k.beep();
		k.brak();
		k.eat(); 
		k.meow();

	}

}
