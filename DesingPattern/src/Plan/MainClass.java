package Plan;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		SelectNetworkPlan n1=new SelectNetworkPlan();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the network for which u want");
		String networkName=sc.next();
		System.out.println();
		
		System.out.println("Enter the number of minutes");
		int minutes=sc.nextInt();
		System.out.println();
		
		CellularPlan p=n1.getPlan(networkName);
		
		System.out.println("Bill amount for" +" "+networkName+" "+"of"+" "+minutes );
		p.getRate();
		p.processBill(minutes);
		
		

	}

}
