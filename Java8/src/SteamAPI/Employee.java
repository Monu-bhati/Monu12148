package SteamAPI;

public class Employee {
	
	private int ID;
	private String NAME;
	private int Age;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Employee(int iD, String nAME, int age) {
		super();
		ID = iD;
		NAME = nAME;
		Age = age;
		
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static int ComapareByname(Employee e1, Employee e2) {
		return e1.NAME.compareTo(e1.NAME);
	}
	
	public static int ComapareById(Employee e1, Employee e2) {
		return Integer.compare(e1.ID,e2.ID);
				}
	
	public static int ComapareByAge(Employee e1, Employee e2) {
		return Integer.compare(e1.Age,e2.Age);
	}

}
