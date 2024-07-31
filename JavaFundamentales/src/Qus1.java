import java.util.Scanner;

public class Qus1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		int Max=arr[0];
		int Min=arr[0];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Read the array elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			}
			
			if(arr[i]<Min) {
				Min=arr[i];
			}
		}
		System.out.println("Maximum value"+Max);
		System.out.println("Minimum value"+Min);
		

	}

}
