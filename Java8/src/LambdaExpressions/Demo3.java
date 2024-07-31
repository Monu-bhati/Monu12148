package LambdaExpressions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo3 {

	public static void main(String[] args) {
		Consumer<String>c1=(String a)->System.out.println("Name:"+a);
		c1.accept("Monu Bhati");
		
		BiConsumer<Integer,Integer>b1=( a,  b)->System.out.println("Addition:"+(a+b));
		b1.accept(20, 30);
		

	}

}
