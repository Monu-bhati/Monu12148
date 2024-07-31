package Map;

import java.util.*;

public class HashMapScannerDemo {

	public static void main(String[] args) {
		Map<Integer,String>hashmap=new HashMap<>();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter Id:"); 
			int b = sc.nextInt();
			System.out.println("Enter Name:");
			String c = sc.next();
			
			hashmap.put(b,c);
		}

		for(Map.Entry<Integer,String>mp:hashmap.entrySet()) {
			System.out.println("\n"+mp.getKey()+" "+mp.getValue());
		}
	}

}
