package lecture6;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elment in array:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		
		System.out.println("\nEnter teh choice:");
		int ch=sc.nextInt();
		switch(ch) {
		
		case(1):{
			
			System.out.println("\nprint the elements array:");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				
			}
			System.out.println("Length of the array: " + arr.length);
		}break;
		
		
		case(2):{
			System.out.println("\nFind Min & Max in Array:");
			
			int max=arr[0];
			int min=arr[0];
			
			for(int i=1;i<arr.length;i++) {
				
				if(arr[i]>max) {
					max=arr[i];
				}
				else if(arr[i]<min) {
					min=arr[i];
				}
				
			}
			System.out.println("\nmax value= " + max + "\nmin value= " + min);
		}break;
		
		case(3):{
			int sum = 0;
			
			for(int i=0;i<arr.length;i++) {
				sum = arr[i]+sum;
			}
			System.out.println("\nSum of array elemenets:" + sum);
		}
		
		case(4):{
			System.out.println("\nExit");
		}break;
		
		default:{
			System.out.println("\nWrong Choice");
		}
		}while(ch!=4);
		
	}

}
