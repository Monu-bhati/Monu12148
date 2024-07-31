package LambdaExpressions;

import java.util.*;
import java.util.function.Consumer;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(3);
		l1.add(8);
		l1.add(7);
		System.out.println(l1);
		
		Consumer<Integer>c=list-> System.out.println(list);
		l1.forEach(c);

	}

}
