package List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		LinkedList<Integer>a1=new LinkedList<>();
		a1.add(2);
		a1.add(4);
		
		System.out.println(a1);
		a1.addFirst(3);
		a1.addLast(50);
		System.out.println(a1);
		a1.add(3, 45);
		System.out.println(a1);
		
		LinkedList<Integer>a2 =  new LinkedList<>();
		a2.add(43);
		a2.add(40);
		a1.addAll(a2);
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println(a1);
		a1.set(4, 35);
		System.out.println(a1);
		
		for(Integer i:a1) {
			System.out.println(i);
		}
		
		a1.remove();
		System.out.println(a1);
		a1.removeLast();
		System.out.println(a1);
		
		a1.add(5);
		a1.add(2);
		System.out.println(a1);
		
		a1.add(2, 30);
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
