package lecture5;

public class SumofArrayElments {

	public static void main(String[] args) {

		int a[] = {3,5,9,20,7};
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			sum = a[i]+sum;
		}
		System.out.println("Sum of array elemenets:" + sum);
	}

}
