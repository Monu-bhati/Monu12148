package Queue;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String>q=new LinkedList<>();
		q.offer("red");
		q.offer("black");
		q.offer("purple");
		q.offer("white");
		System.out.println(q);
		
		Queue<String>a=new ArrayDeque<>();
		a.offer("Black");
		a.offer("Red");
		a.offer("White");
		a.offer("Pink");
		System.out.println(a);
		System.out.println(a.poll());
		
		Queue<String>p=new PriorityQueue<>();
		p.offer("b");
		p.offer("o");
		p.offer("u");
		p.offer("a");
		System.out.println(p);

	}

}
