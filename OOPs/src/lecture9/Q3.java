 package lecture9;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks:");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int total=s1+s2+s3+s4;
		double p = total/300*100;
		if(s1>0 || s2>0 || s3>0 || s4>0) {
			System.out.println("Total of 3 subjects:" + total);
			System.out.println("Percetage:"+ p);
		}else {
			System.out.println("Unsufficant Data");
		}
		
		
	}

}
