package com.july5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String>a1=new ArrayList<>();
		
		System.out.println("Enter ements(enter q for quit).");
		
		while(true) {
			String i=sc.next();
			
			if(i.equalsIgnoreCase("q")) {
				break;
			}
			a1.add(i);
		}
		
		System.out.println("Elements are");
		
		for(int j=0;j<a1.size();j++) {
			System.out.println(a1.get(j));
		}
		
		System.out.println("Using while");
		
		int r=0;
		while(a1.size()>r) {
			System.out.println(a1.get(r));
			r++;
		}
		System.out.println("Using enhanced for loop");
		
		for(String b:a1) {
			System.out.println(b);
		}
     System.out.println("Using Iterator");
     
     Iterator itr=a1.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
	
	}

}
