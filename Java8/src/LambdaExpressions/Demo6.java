package LambdaExpressions;

import java.util.*;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>m1=new HashMap<>();
		m1.put("Monu", 20);
		m1.put("Bahvana", 19);
		m1.put("Sonu", 17);
		m1.put("Mahesh", 12);
		
		m1.forEach((name,age)->System.out.println(name+" "+age));

		

	}

}
