package com.july5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Demo3 {

	public static void main(String[] args) {
		LinkedList<Integer>a1=new LinkedList<>();

		a1.add(5);
		a1.add(4);
		System.out.println(a1);
		a1.addFirst(10);
		a1.addLast(3);
		a1.add(3,30);
		System.out.println(a1);
		LinkedList<Integer>a2=new LinkedList<>();
		
		a2.add(2);
		a2.add(1);
		a1.addAll(a2);
		System.out.println(a1);
		
		//sort the data
		
		Collections.sort(a1);
		System.out.println(a1);
		a1.set(2, 333);
		System.out.println(a1);
	for(Integer i:a1) {
		System.out.println(i);
	}
	//bydefault it remove fisrt index
	a1.remove();
	System.out.println(a1);
	a1.removeLast();
	System.out.println(a1);
	
	a1.add(5);
	a1.add(2);
	System.out.println(a1);
	a1.add(3,2);
	System.out.println(a1);
	a1.remove(3);
	System.out.println(a1);
	a1.removeLastOccurrence(2);
	System.out.println(a1);
	
	a1.removeFirstOccurrence(5);
	System.out.println(a1);
	a1.clear();
	System.out.println(a1);
	}

}
