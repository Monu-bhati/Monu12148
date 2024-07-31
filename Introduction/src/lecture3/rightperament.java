package lecture3;

import java.util.Scanner;

public class rightperament {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		
		for(int i=1;i<size;i++) {
			for(int space=2*(size-i);space>=0;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
