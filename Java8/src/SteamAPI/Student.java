package SteamAPI;

public class Student implements Comparable<Student> {
	
	private String Sname;
	private int Sage;
	
	public String getName() {
		return Sname;
	}
	public void setName(String name) {
		this.Sname = name;
	}
	public int getAge() {
		return Sage;
	}
	public void setAge(int age) {
		this.Sage = age;
	}
	
	public Student(String name, int age) {
		super();
		this.Sname = name;
		this.Sage = age;
	}
	@Override
	public int compareTo(Student p1) {
		// TODO Auto-generated method stub
		return this.Sname.compareTo(p1.Sname);
	}
	

}
