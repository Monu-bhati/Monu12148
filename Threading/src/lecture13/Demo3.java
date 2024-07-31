package lecture13;

public class Demo3 extends Thread{
	
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main (String[] args ) {
		
		Demo3 d1 = new Demo3();
		Demo3 d2 = new Demo3();
		Demo3 d3 = new Demo3();
		
		d1.start();
		try {
			d1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		d2.start();
		try {
			d2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		d3.start();
		try {
			d3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("Thread one:"+d1.getName());
		//System.out.println("Thread ID1:"+d1.getId());
		d1.setName("Sam");
		
		System.out.println("Thread one:"+d2.getName());
		//System.out.println("Thread ID2:"+d2.getId());
		d2.setName("Jhon");
		
		System.out.println("Thread one:"+d3.getName());
		//System.out.println("Thread ID3:"+d3.getId());
		d3.setName("Ajay");
	}

}
