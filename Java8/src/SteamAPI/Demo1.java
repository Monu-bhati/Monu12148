package SteamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("Jon","Sam","Ajay","Vijay","Vishal");
		System.out.println(list);
		// Filter method
		List<String>FilterList=list.stream().filter(name->name.startsWith("V")).collect(Collectors.toList());
		System.out.println(FilterList);
		
		List<String>list2=list.stream().map(name->name).collect(Collectors.toList());
		System.out.println(list2);
		
		List<String>list3=list.stream().sorted().collect(Collectors.toList());
		System.out.println(list3);
		
		List<String>list4=list.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(list4);
		
		List<Integer>L1=Arrays.asList(10,7,9,4,8,5,10,3,2,1,5,4);
		System.out.println(L1);
		
		List<Integer>L2=L1.stream().distinct().collect(Collectors.toList());
		System.out.println(L2);
		
		List<Integer>L3=L1.stream().limit(5).collect(Collectors.toList());
		System.out.println(L3);
		
		List<Integer>L4=L1.stream().sorted().collect(Collectors.toList());
		System.out.println(L4);
		
		List<Integer>sum=Arrays.asList(3,8,2,0,3);
		int result=sum.stream().reduce(0, (a,b)->(a+b));
		System.out.println(result);
		

	}

}
                                                                  