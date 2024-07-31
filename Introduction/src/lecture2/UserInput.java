package lecture2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the menu Name: ");
		String MenuName = sc.nextLine();
		
		System.out.println("Enter Quantity: ");
		int qty=sc.nextInt();
		
		System.out.println("Enter the price:");
		int Price = sc.nextInt();
		
		System.out.println("Name of the Menu: "+ MenuName + "\nQuatity of the menu: "+ qty + " \nPrice of the Menu: " + Price);

	}

}
