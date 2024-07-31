package animal;

public class ChoicAnimal {
	static Animal CreateAnimla(String type) {
		
		if(type.equals("Dog")) {
			return new Dog();
		}
		else if(type.equals("Cat")) {
			return new Cat();
		}
		else {
		return null;
		}
	}

}
