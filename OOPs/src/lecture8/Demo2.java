package lecture8;

public class Demo2 {
	public static void main(String args[]) {
		EncapsulationDemo2 d1 = new EncapsulationDemo2();
		d1.setName("Speaker");
		d1.setId(101);
		
		System.out.println("Course ID:" + d1.getId() + "\nCourse Name:" + d1.getName());
	}

}
