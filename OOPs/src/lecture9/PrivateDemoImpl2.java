package lecture9;

public class PrivateDemoImpl2 {

	public static void main(String[] args) {
		PrivateDemoImpl p1=new PrivateDemoImpl();
		p1.setName("Monu");
		p1.setRollno(6448);
		p1.setDepartment("IT");
		
		System.out.println(p1.getName()+" "+p1.getRollno()+" "+p1.getDepartment());
	}

}
