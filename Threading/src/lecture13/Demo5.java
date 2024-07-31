package lecture13;

public class Demo5 extends Thread {
	
	public void run() {
		int a=10;
		for(int i=1;i<=10;i++) {
			System.out.println(a*i);
		}
	}

	public static void main(String[] args) {
	  Demo5 d = new Demo5();
	  Demo5 d1 = new Demo5();
	  
	  System.out.println("running Thread 1");
	  d.start();
	  d.setPriority(MIN_PRIORITY);
	  try {
		d.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("running Thread 2");
	  d1.setPriority(MAX_PRIORITY);
	  d1.start();
	  
	  System.out.println("Priority d1:" + d.getPriority());
	  System.out.println("Priority d2:" + d1.getPriority());
	  
	}

}
