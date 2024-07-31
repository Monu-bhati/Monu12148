package DefaultMethod;

interface Medical{
	
	void MedHistory();
	
	default void phistory() {
		System.out.println("Patient history");
	}
	
	default void lab() {
		System.out.println("Mutliple labs");
	}
	default void address() {
		System.out.println("Hosptial in Thane");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		Medical p1=()->System.out.println("Medical History");
		p1.phistory();
		p1.lab();
		p1.address();
	}

}
