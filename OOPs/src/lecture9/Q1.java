package lecture9;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your name: ");
		String name=sc.next();
		System.out.print("Enter Your roll no: ");
		int rollno=sc.nextInt();
		System.out.print("Feild of Interest: ");
		String Interest=sc.next();
		
		System.out.println("Hey, My name is "+name+" and my roll number is "+rollno+". My field of interest are "+Interest);

	}

}
