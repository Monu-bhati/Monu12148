package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<String>s1=new HashSet<String>();
		s1.add("Jhon");
		s1.add("Sam");
		s1.add("Ajay");
		s1.add("Vimal");
		s1.add("Jhon");
		System.out.println(s1);
		
		Set<String>s2=new LinkedHashSet<>();
		s2.add("Sam");
		s2.add("Ajay");
		s2.add("Jhon");
		s2.add("Joy");
		s2.add("Vimal");
		s2.add("Jhon");
		System.out.println(s2);
		
		Set<String>s3=new TreeSet<String>();
		s3.add("Jhon");
		s3.add("Aajay");
		s3.add("Joy");
		s3.add("Sam");
		s3.add("Joy");
		s3.add("Vimal");
		System.out.println(s3);
		
		Iterator<String>itr=s3.iterator() ;
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}System.out.println("ForEach Loop");
		System.out.println();
		
		for(String s:s3){
			System.out.println(s);
		}
		s3.remove("Vimal");
		System.out.println(s3);
		System.out.println();
		
		if(s3.contains("Vimal")) {
			System.out.println("Vimal is Available");
		}else {
			System.out.println("Searching Failed");
			
			Set<String>s4=new TreeSet<String>();
			s4.add("Keshav");
			s4.add("Anup");
			s4.add("Anushi");
			s2.addAll(s4);
			System.out.println(s2);
		}

	}

}
