package lecture5;

import java.util.Scanner;

public class Arraywithuserinput {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the Size of  the array: ");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("\nEnter the elments in array: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("\nprint the elments of array: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
			
		}
	}

}
