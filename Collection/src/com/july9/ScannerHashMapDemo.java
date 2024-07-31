package com.july9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ScannerHashMapDemo {

	public static void main(String[] args) {
		 Map<Integer, String> hashmap = new HashMap<>();
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size :");
	        int n = sc.nextInt();
	        int[] a = new int[n];

	        for (int i = 0; i < a.length; i++) {
	        	System.out.println("Enter Id:");
	            Integer b = sc.nextInt();
	            System.out.println("Enter Name:");
	            String c = sc.next();

	            hashmap.put(b, c);
	        }

	        for (Map.Entry<Integer, String> mp : hashmap.entrySet()) {
	            System.out.println("\n" + mp.getKey() + " " + mp.getValue());
	        }
	    }
	}


