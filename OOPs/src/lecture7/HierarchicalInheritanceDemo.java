package lecture7;
 class Mother{
	 String Mname = "Santosh Bhati";
	 
 }
 
class Daugther1 extends Mother {
	 
	 String Daugther1Name="Monu Bhati";
	 String D1eductaion="UG(BSC TI)";
 }

class Daugther2 extends Mother {
	 
	 String Daugther2Name="Bhavana Bhati";
	 String D2eductaion="UG(BSC DSAI)";
	 
	 
}
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Daugther1 d1 = new  Daugther1();
		 Daugther2 d2 = new  Daugther2();
		 
		 System.out.println("Monther Name: " + d1.Mname + "\nDaugther info: " + d1.D1eductaion + " " + d1.Daugther1Name + "\n" + d2.D2eductaion +" " + d2.Daugther2Name);
 
	}

}
