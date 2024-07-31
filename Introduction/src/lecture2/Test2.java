package lecture2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
		
		System.out.println("Ent`er the number:");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd number");
		}
	}
	

}
