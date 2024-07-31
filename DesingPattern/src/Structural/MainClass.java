package Structural;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.KFC");
			System.out.println("2.McDonals");
			System.out.println("3.Dominos");
			System.out.println("4.Exit");
			System.out.println();
			ch=sc.nextInt();
			
			FranchiseRegistration f=new FranchiseRegistration();
			switch(ch) {
			
			case (1):
				f.BuyKFC();
			break;
			
			case (2):
			    f.BuyMcDonals();
		   break;
			case (3):
			    f.BuyDominos();
		   break;
			case (4):
			    f.BuyMcDonals();
		   break;
		   default:
			   
			}
		   
		
				
			
		}while(ch!=5);

	}

}
