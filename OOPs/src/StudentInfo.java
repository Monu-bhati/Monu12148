import java.util.*;

abstract class Info1{
	
	String name;
	int Rollno;
	String Div;
	abstract void showinfo(String name,int Rollno,String Div); 
		
	
}
class info1 extends Info1{

	
	
	void userinput(int a) {
		System.out.println("User input:"+a);
	}

	@Override
	void showinfo(String name, int Rollno, String Div) {
		// TODO Auto-generated method stub
		
	}

	
	
}
public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		info1 s1=new info1();
		s1.showinfo("Rohan", 46, "G");
		System.out.println("Enter your input:");
		s1.userinput(sc.nextInt());

	}

}
