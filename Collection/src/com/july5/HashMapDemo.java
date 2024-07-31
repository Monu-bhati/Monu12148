package com.july5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		Map <Integer,String>m1=new HashMap<>();
		m1.put(99, "jhon");
		m1.put(97, "Ajay");
		m1.put(99, "ash");
		m1.put(60, "sam");
		System.out.println(m1);
		Map <Integer,String>m2=new LinkedHashMap<>();
		m2.put(99, "jhon");
		m2.put(97, "Ajay");
		m2.put(99, "ash");
		m2.put(60, "sam");
		System.out.println(m2);

		Map <Integer,String>m3=new TreeMap<>();
		m3.put(99, "jhon");
		m3.put(97, "Ajay");
		m3.put(99, "ash");
		m3.put(60, "sam");
		System.out.println(m3);
	}

}
