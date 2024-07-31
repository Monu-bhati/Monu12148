package OptionalClass;

import java.util.Arrays;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {

		List<String>l1=Arrays.asList("Joy","Ajay","Vishal","Kunal","Rishi");
		//ArrayList<String>a1=new ArrayList<>();
		for(String i:l1) {
			Optional<String>op=Optional.ofNullable(i);
			if(op.isPresent()) {
				String result=op.get();
				System.out.println(result);
			}
		}
		
		
	}

}
