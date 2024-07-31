package LambdaExpressions;


import java.util.*;

public class Demo5 {

	public static void main(String[] args) {
		
		List<String>l1=new ArrayList<>();
		l1.add("Aalok");
		l1.add("Kavita");
		System.out.println(l1);
		
		List<String>l=Arrays.asList("Jhon","Mohit","Sonu","Monu");
		l.forEach(list->System.out.println(list));

	}

}
