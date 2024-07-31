package lecture2;

import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Integer Num: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter Second Integer Num: ");
		int num2= sc.nextInt();
		
		
		System.out.println("Addition: " + (num1+num2));
		System.out.println("Subtracation: " + (num1-num2));
		System.out.println("Mutliplcation: " + (num1*num2));
		System.out.println("Division: " + (num1/num2));

	}

}
