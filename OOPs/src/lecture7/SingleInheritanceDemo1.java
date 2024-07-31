package lecture7;
class Employee{
	String eName="Ajay";
	String designation="Jr Java Developer";
}

class Company extends Employee{
	
	String Company = "Tcs";
	
	void Display(){
		System.out.println("Employee Details" + "\nEmployee Name: " + eName + "\nDesignation: " + designation + "\nComapany  Name: " + Company );
	}
}
public class SingleInheritanceDemo1 {

	public static void main(String[] args) {
		Company c = new Company();
		c.Display();

	}

}
