package lecture7;

class Vehicals{
	String ModelName;
	int VechicalNo;
	int Speed;
	
}

class Maruti extends Vehicals{
	
	String ColorofVechical;
	String TypeofVechical;
}

class Bike extends Maruti{
	
	int Price ;
	
}

class Cycle extends Bike{
	
	void VehicalDetail() {
		System.out.println("********* Details of Vechicals *********" + "");
	}
}
public class Q3 {

	public static void main(String[] args) {
		

	}

}
