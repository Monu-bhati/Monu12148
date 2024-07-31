package lecture7;
class Student{
	String sName;
	int sRollno;
	void display(String name,int rollno) {
		System.out.println("Name of Student: " + name + "\nRollno of the Student: " + rollno);
	}
}
public class Q1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display("Monu", 6448);
		
		Student s2 = new Student();
		s2.display("Goldi", 6468);
		
	}

}
