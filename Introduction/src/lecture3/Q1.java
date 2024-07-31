package lecture3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****WELCOME TO STUDENT PROTFOLIO*****");
		int ch=0;
		int S1=0 ,S2=0 ,S3=0 ;
		int total=(S1+S2+S3);
		double avg = total/3;
		
		{if(avg==90 && avg>90) {
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
		};
		do {
			
			System.out.println("PRESS 1 : STUDENT INFO");
			System.out.println("PRESS 2 : STUDENT TOTAL & AVG MARKS");
			System.out.println("PRESS 3 : STUDENT FINAL GRADE");
			System.out.println("PRESS 4 : FINAL RESULT");
			System.out.println("PRESS 5 : EXIT");


			System.out.println("\nEnter the choise");
			ch = sc.nextInt();
			switch(ch){
			
			case(1):
			{
				System.out.println("\n********************Student Information********************");
				System.out.println("Enter Student name: ");
				String Sname = sc.next();
				System.out.println("Enter Student age: ");
				int age = sc.nextInt();
				System.out.println("Enter Student Rollno: ");
				int Rollno = sc.nextInt();
				System.out.println("Enter Student Div: ");
				String Div = sc.next();
				
				System.out.println("Student Info: "+ "\n Student name: "+ Sname + "\nStudent age: " + age + "\nStudent Rollno: " + Rollno + "\nStudent Div: " + Div + "\n\n");
			}break;
			
			case(2):
			{
				System.out.println("\n********************Student Total & avg Marks********************");
				System.out.println("Enter the marks for S1:");
				 S1= sc.nextInt();
				System.out.println("Enter the marks for S2:");
				 S2= sc.nextInt();
				System.out.println("Enter the marks for S3:");
				 S3= sc.nextInt();
				
				System.out.println("Total marks: "+total);
				System.out.println("Avg Marks: " +avg );

				
			}break;
			
			case(3):{
				System.out.println("\n********************Student Final result********************");

				if(avg>35) {
					System.out.println("You are Pass");
				}else {
					System.out.println("You are Fail");
				}
			
			}break;
			
			
			case(4):
			{
				System.out.println("EXIT");
				
			}break;
			
			
			default:
				System.out.println("Wrong Choice!!!");
		
			}
	
		}while(ch!=4);
	}

}
}
