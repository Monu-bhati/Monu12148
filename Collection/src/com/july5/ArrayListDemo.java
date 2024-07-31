package com.july5;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String>a1=new ArrayList<String>();
		
		//store elements in a1 object
		
		a1.add("red");
		a1.add("black");
		a1.add("red");
		a1.add("white");
		a1.add("green");
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		a1.add("purple");
		System.out.println(a1);

		a1.add(2, "gray");
		System.out.println(a1);
		
		a1.set(3, "blue");
		System.out.println(a1);
		//get() method is returning perticular index value
		System.out.println(a1.get(3));
		//indexOf() method returning element index number
		System.out.println(a1.indexOf("gray"));
		a1.remove(2);
		System.out.println(a1);
		a1.remove("red");
		
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		if(a1.isEmpty()) {
			System.out.println("List is not avaialble");
		}
		else {
			System.out.println(a1);
		}
	}

}
