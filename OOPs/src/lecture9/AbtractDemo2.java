package lecture9;

abstract class VehicalApp{
	String color ="black";
	
	abstract void speed(int s);
	
	void warrenty() {
		System.out.println("5 year warrenty");
	}
}

class CarApp extends VehicalApp{
	
	void speed(int s) {
		System.out.println("The speed of the car is:" + s);
	}
	
	
}

public class AbtractDemo2 {

	public static void main(String[] args) {
		CarApp c1=new CarApp();
		
		System.out.println("Color of the vehical is:" + c1.color);
		c1.speed(50);
		c1.warrenty();

	}

}
