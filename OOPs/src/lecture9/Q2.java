package lecture9;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1==n2 && n2==n3 && n3==n1) {
			System.out.println("All 3 no are equal");
		}
		else if(n1==n2 || n2==n3 || n3==n1){
			System.out.println("Anly 2 no are equal");
		}else {
			System.out.println("No one is equal");
		}

	}

}
