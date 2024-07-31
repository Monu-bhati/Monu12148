package lecture6;

import java.util.Scanner;

public class Test1STRING {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		String s1 ="Mumbai";
		System.out.println("Lenght of the String: " + s1.length());
		System.out.println("Whole String in uppercase: " + s1.toUpperCase());
		System.out.println("Whole String in Lower Case: " +s1.toLowerCase());
		
		String fName="Monu";
		String lName="Bhati";
		System.out.println(fName+lName);
		
		System.out.print("Enter the Your Uaername: ");
		String Username=sc.next();
		
		System.out.print("Enter the Your Password: ");
		String ps=sc.next();
		
		if(Username.equals("admin")   &&  ps.equals("admin")) {
			System.out.println("Login Done!!!!!!!!");
		}else {
			System.out.println("Login Fail!!!!!");
		}
	}

}
