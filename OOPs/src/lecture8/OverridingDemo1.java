package lecture8;


class Developer{
	void show(String name){
		System.out.println("Developer Name:" + name);
		
	}
}

class Tester{
	void show(String name){
		System.out.println("Tester Name:" + name);
		
	}
}
class Designer{
	void show(String name){
		System.out.println("Ui Designer Name:" + name);
		
	}
}
public class OverridingDemo1 {

	public static void main(String[] args) {
		
		Developer d = new Developer();
		d.show("Jon");

		Tester t = new Tester();
		t.show("sam");
		
		Designer d1= new Designer();
		d1.show("nick");
	}

}
