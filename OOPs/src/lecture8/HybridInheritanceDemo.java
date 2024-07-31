package lecture8;

class Grandfather{
	void G() {
		System.out.println("This is Grandfather class");
	}
}

class Father extends Grandfather{
	void F() {
		System.out.println("This is Father calss");
	}
}

class Daugther extends Father{
	void D() {
		System.out.println("This is Daugther calss");
	}
}

class Son extends Father{
	void S() {
		System.out.println("This is Son class");
	}
}

class S1 extends Son{
	void s1() {
		System.out.println("This is S1 class");
	}
}

class S2 extends S1{
	void s2() {
		System.out.println("This is S2 class");
		}
}
public class HybridInheritanceDemo {

	public static void main(String[] args) {
		Daugther D= new Daugther();
		D.D();
		D.F();
		D.G();
		
		S2 ss = new S2();
		ss.S();
		ss.s2();
		ss.s1();

	}

}
