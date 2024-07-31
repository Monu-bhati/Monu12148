package lecture13;

public class Demo2Thread implements Runnable{

	@Override
	public void run() {
		
		System.out.println("This is Run method");
	}
	public static void main(String[] args) {
		Demo2Thread d1 = new Demo2Thread();
		Thread t1 = new Thread(d1);
		t1.start();

	}

	

}
