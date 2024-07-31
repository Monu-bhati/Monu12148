package com.july5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String>s1=new HashSet<String>();
		
		s1.add("Jhon");
		s1.add("Sam");
		s1.add("Ajay");
		s1.add("vimal");
		s1.add("Sam");
		System.out.println(s1);
		

		Set<String>s2=new LinkedHashSet<String>();
		
		s2.add("Jhon");
		s2.add("Sam");
		s2.add("Ajay");
		s2.add("vimal");
		s2.add("Sam");
		System.out.println(s2);

		Set<String>s3=new TreeSet<String>();
		
		s3.add("Jhon");
		s3.add("Sam");
		s3.add("Ajay");
		s3.add("vimal");
		s3.add("Sam");
		System.out.println(s3);
		
		Iterator<String>itr=s3.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}
		System.out.println("ForEach Loop");
		
		for(String s:s3) {
			System.out.println(s);
		}

	s3.remove("vimal");
	System.out.println(s3);
	
	if(s3.contains("vimal")) {
		System.out.println("vimal string availale");
	}
	else {
		System.out.println("Searching failed");
	}
	Set<String>s4=new TreeSet<String>();
	
	s4.add("keshav");
	s4.add("Anup");
	s4.add("Anushri");
	s2.addAll(s4);
	System.out.println(s2);
	}
	

}