package lecture3;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no1:");
		int i = sc.nextInt();
		System.out.println("Enter the no2:");
		int j = sc.nextInt();
		
		int ch=0;
		
		do{
			System.out.println("Press 1: Addition");
			System.out.println("Press 2: Subtracation");
			System.out.println("Press 3: Multiplcation");
			System.out.println("Press 4: Division");
			System.out.println("Press 5: Exit");
			
			ch = sc.nextInt();
			
			switch(ch) {
			
			case (1):
				System.out.println("Addition:"+(i+j));
			break;
			
			case (2):
				System.out.println("Subtraction:"+(i-j));
			break;
			
			case (3):
				System.out.println("Multiplcation:"+(i*j));
			break;
			
			case (4):
				System.out.println("Division:"+(i/j));
			break;
			
			case (5):
				System.out.println("Exit");
			break;
			
			default:
				System.out.println("Wrong choice");
				
			}  
		}while(ch!=5);
		
		
	}

}
