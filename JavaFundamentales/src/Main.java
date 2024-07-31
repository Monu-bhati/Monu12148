import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Map<Post,Integer>m1=new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		int ch;
		
		
		do {
			
			System.out.println("Press 1:Add the Data ");
			System.out.println("Press 2:Read the Data");
			System.out.println("Press 3:Update the Data");
			System.out.println("Press 4:Delet the Data");
			System.out.println("Press 5:Exit");
			System.out.println();
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("Enter post Id");
				int pid=sc.nextInt();
				System.out.println("Enter post Name");
				String pname=sc.next();
				System.out.println("Enter post Comment");
				String pcomment=sc.next();
				
				                                                                                                                                                                                                                                                                                                                                                                                                                                          
			break;	
			}
		}while(ch!=5);

	}

}
