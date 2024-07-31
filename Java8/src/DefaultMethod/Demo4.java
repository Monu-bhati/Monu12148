package DefaultMethod;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Demo4 {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("Aman","Vijay","Shekar","Vinod");
		System.out.println(names);

		// Using lambda expression
		List<String>name1=names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(name1);
		
		//using method reference
		List<String>name2=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(name2);

		
	}

}
