package lecture3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
        // Print the table of the user input number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int i = sc.nextInt();
		int j = 1;
		
		while(j<=10) {
			
			System.out.println(i +" X "+ j +" = "+ (i*j));
			j++;
		}
	}

}
