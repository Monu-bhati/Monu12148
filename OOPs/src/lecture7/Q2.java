package lecture7;
class Doctor{
	String Pname ;
	String Dname;
	String ApointmentTime;
	
}

class Pateint extends Doctor{
	
	void ApointmentDetails(String Pname, String Dname, String ApointmentTime) {
		System.out.println("Appointment with Doctor that is " + Dname + " With Pateint  " + Pname + " on " + ApointmentTime);
	}
}
public class Q2 {

	public static void main(String[] args) {
		
		Pateint p1=new Pateint();
		p1.ApointmentDetails("Mr yadav", " Dr Shetty" ,"12:00");

	}

}
