package lecture13;
// Thread is created by extending "Thread" Class
public class Demo1Thread extends Thread {
	
	public void run() {
		System.out.println("This is Thread Run Method");
		
	}

	public static void main(String[] args) {
		Demo1Thread d1 = new Demo1Thread();
		d1.start();

	}

}
