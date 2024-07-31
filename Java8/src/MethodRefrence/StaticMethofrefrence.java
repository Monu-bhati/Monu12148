package MethodRefrence;

interface Calci{
	void add(int i, int j);
	
}
class op{
	static void addition(int a,int b) {
		System.out.println("Addtion"+" " + a+b);
	}
}

interface Demo{
	void say();
	
}

class Msg{
	
	static void sayHello() {
		System.out.println("Hello everyone");
	}
}


public class StaticMethofrefrence {

	public static void main(String[] args) {
		
		
		Calci c1=op::addition;
		c1.add(10, 20);
		
		Demo d1=Msg::sayHello;
		d1.say();

		
	}

}
