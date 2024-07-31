package lecture3;

import java.util.Scanner;

public class humperament2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		for(int i=size;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				//System.out.print("*");
				//System.out.print(i);
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		}

}
