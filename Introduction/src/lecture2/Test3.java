package lecture2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String Name=sc.nextLine();
		
		System.out.println("Enter the Age: ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println(Name+" is eligible for Voting");
		}else {
			System.out.println(Name+" is not eligible for Voting");

		}
		
		
		

	}

}
