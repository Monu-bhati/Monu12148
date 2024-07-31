package lecture2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String Name= sc.nextLine();
		
		System.out.println("Enter marks for m1:");
		int m1= sc.nextInt();
		
		System.out.println("Enter marks for m2:");
		int m2= sc.nextInt();
		
		System.out.println("Enter marks for m3:");
		int m3= sc.nextInt();

		int Total= m1+m2+m3;
		
		double avg = Total/3;
		
		System.out.println("Name of the Student is: " + Name + " \nTotal of thje marks are: " + Total + "\nAveger of the Total is "+ avg );
		
		if(avg==90 && avg>90) {
			System.out.println("A Grade");
		}
		else if(avg<=89 && avg>70) {
			System.out.println("B Grade");
		}
		else if(avg<=70 && avg>50) {
			System.out.println("C Grade");
		}
		else if(avg<=50 && avg>35) {
			System.out.println("D Grade");
		}else {
			System.out.println("You Are Fail");
		}
	}

}
