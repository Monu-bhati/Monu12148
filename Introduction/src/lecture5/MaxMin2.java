package lecture5;

import java.util.Arrays;

public class MaxMin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,6,90,34,0,20};
		Arrays.sort(a);
		
		System.out.println("max value= " + a[a.length-1] + "\nmin value= " + a[0]);
	}

}
