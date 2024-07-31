package lecture7;

public class Student3 {

	String name ;
	int age ;
	
	public void Disp(String n,int a) {
		name=n;
		age=a;
	}
	
	public void show() {
		System.out.println(name + " " + age);
	}
	public static void main(String[] args) {
		
		Student3 st = new Student3();
		st.Disp("sam", 20);
		st.show();
			
		
}

}
