package Map;

import java.util.*;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer,String>m1=new HashMap<Integer,String>();
		
		m1.put(101, "Sam");
		m1.put(106, "Ash");
		m1.put(100, "Jhon");
		m1.put(109, "Ajay");
		System.out.println(m1);

		Map<Integer,String>m2=new LinkedHashMap<Integer,String>();
		
		m2.put(1, "Sam");
		m2.put(6, "Ash");
		m2.put(2, "Jhon");
		m2.put(9, "Ajay");
		System.out.println(m2);
		

		Map<Integer,String>m3=new TreeMap<Integer,String>();
		
		m3.put(209, "Sam");
		m3.put(206, "Ash");
		m3.put(200, "Jhon");
		m3.put(219, "Ajay");
		System.out.println(m3);
		

	}

}
