package lecture9;

interface Employee{
	String EName="Jhon";
	void showEmp();
}

interface Company{
	String CName="TCS";
	void showCom();
}

interface Department extends Employee,Company{
	String DName="CS";
	void showDemp();
}

class Details implements Department{

	@Override
	public void showEmp() {
		System.out.println("Employee name:" + EName);
		
	}

	@Override
	public void showCom() {
		System.out.println("Company name:" + CName);
		
	}

	@Override
	public void showDemp() {
		System.out.println("Department name:" + DName);
		
	}
	
	
}
public class InterfaceDewmo1 {

	public static void main(String[] args) {
		Details D1= new Details();
		D1.showCom();
		D1.showDemp();
		D1.showEmp();

	}

}
