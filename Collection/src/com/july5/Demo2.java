package com.july5;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Menu>a1=new ArrayList<Menu>();
		
		a1.add(new Menu(101,"idli",20.15,2));
		a1.add(new Menu(98,"vada",10.15,1));
		
		System.out.println(a1);
		
		for(Menu m:a1) {
			System.out.println(m);
		}

	}

}
