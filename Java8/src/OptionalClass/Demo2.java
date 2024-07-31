package OptionalClass;

import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add(null);
		list.add("d");
		list.add(null);
		list.add("e");
		
		List<Optional<String>>op=list.stream().map(Optional::ofNullable).collect(Collectors.toList());
		System.out.println(op);
		
		Optional<String>op1=Optional.of("Ajay");
		op1.ifPresent(value->System.out.println(value));
		String defaultvale=op1.orElse("Default value");
		System.out.println(defaultvale);

	}

}
