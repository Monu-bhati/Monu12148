package Map;

import java.util.concurrent.*;

public class ConCurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String>g=new ConcurrentHashMap<>();
		Thread t1=new Thread()
		{
			public void run() {
				g.put(101, "Jhon");
				System.out.println(g.get(101));
			}
		};
		
		Thread t2=new Thread()
		{
			public void run() {
				g.put(102, "Sam");
				System.out.println(g.get(102));
			}
		};
		
		t1.start();
		t2.start();

	}

}
