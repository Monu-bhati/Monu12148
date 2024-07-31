package MethodRefrence;

interface Vechicle{
	
	void speed(int a);
	
}
class Bike{
	Bike(int a){
		System.out.println("Bike Speed:"+a);
	}
}
public class ConstructorRefrence {

	public static void main(String[] args) {
		
		Vechicle v=Bike::new;
		v.speed(50);

	}

}
