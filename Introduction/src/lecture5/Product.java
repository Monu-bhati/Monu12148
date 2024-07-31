package lecture5;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the id of Product: ");
		int id = sc.nextInt();
		
		System.out.println("Enter the name of Product: ");
		String name = sc.next();
		
		System.out.println("Enter the price of Product: ");
		double Price = sc.nextDouble();
		
		System.out.println("Enter the quantity of Product: ");
		int qty = sc.nextInt();
		
		System.out.println("Enter the Oder date of Product: ");
		String OD = sc.next();
		
		System.out.println("Enter the recive date of Product: ");
		String RD = sc.next();
		
		System.out.println("\n \n \nEnter the choice:");
		int ch=sc.nextInt();
		
		switch(ch){
		
		
		case(1):{
			System.out.println();
			System.out.println("***********Product Details***********");
			System.out.println("Producr ID: "+ id + "\nProduct name: " + name + "\nProduct Price: Rupess" + Price + "\nProduct Order Date: " + OD + "\nProduct Recevied Date: " + RD );
		}break;
		
		case(2):{
			System.out.println("***********Product Bill***********");
			System.out.println("Name of the Product: "+ name +"\nqty of the Product: "+ qty +"\nTotal Bill of the Products: Rupees" + (Price*qty) );
		}break;
		
		case(3):{
			
			System.out.println("Exit");
		}break;
		
		default:{
			System.out.println("Wrong Choice");

		}
		
		}while(ch!=3);
	}

}
