package lecture2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		
		if(number>=0) {
			System.out.println("Given number is Postive");
		}else {
			System.out.println("Given number is Negative");
		}
		
		
	}

}
