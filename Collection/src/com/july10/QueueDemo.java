package com.july10;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	Queue<String>q=new LinkedList<>();
	
	q.offer("red");
	q.offer("white");
	q.offer("black");
	q.offer("black");
	System.out.println(q);
	q.offer("purple");
	System.out.println(q.peek());
	System.out.println(q);
	System.out.println(q.poll());
Queue<String>a=new ArrayDeque<>();
	
	a.offer("red");
	a.offer("white");
	a.offer("black");
	a.offer("black");
	System.out.println(a);
	//poll() is used to remove top element from the queue
	System.out.println(a.poll());
	
	a.add("purple");
	System.out.println(a);
Queue<String>p=new PriorityQueue<>();
	
	p.offer("red");
	p.offer("white");
	p.offer("black");
	p.offer("black");
	System.out.println(p);
	  

	for(String s:p) {
		System.out.println(s);
	}
}
}