package List;

import java.util.ArrayList;
import java.util.Scanner;

public class PostTest1 {

	public static void main(String[] args) {
		
		ArrayList<Post>p = new ArrayList<Post>();
		Scanner sc = new Scanner(System.in);
		//ch=choice;
		int ch;
		
		System.out.println("ArrayList Crud App");
		
		do {
			System.out.println("Press 1:Add Data in to ArrayList");
			System.out.println("Press 2:Read Data from ArrayList");
			System.out.println("Press 3:Update Data in  ArrayList");
			System.out.println("Press 4:Remove Data From ArrayList");
			
			System.out.println("Enter your Choice:");
			ch=sc.nextInt();
			
			
			switch(ch) {
			
			case 1:
				System.out.println("Enter Post Id");
				int pid = sc.nextInt();
				System.out.println("Enter Post Name");
				String pn = sc.next();
				System.out.println("Enter Post Comments");
				String pc =sc.next();
				System.out.println("Enter post date");
				String pdate = sc.next();
				p.add(new Post(pid,pn,pc,pdate));
				System.out.println("Data added Successfully");
				System.out.println();
			break;
			
			case 2:
				for(Post post:p) {
					System.out.println(post.getPostId()+" " + post.getPostName() + " " + post.getPostComments()+ " " + post.getPostDate());
				}System.out.println();
			break;
			
			case 3:
				Post pp = new Post();
				System.out.println("Which index u want to update");
				int index = sc.nextInt();
				Post post = p.get(index);
				System.out.println("Post Name");
				pn=sc.next();
				post.setPostDate(pn);
				
				System.out.println("Enter Post comments");
				pc=sc.next();
				post.setPostComments(pc);
				
				System.out.println("Enter Post Date");
				pdate=sc.next();
				post.setPostDate(pdate);
				System.out.println("Upadted Successfully");
				
			break;
			
			case 4:
				System.out.println("which index u want to remove:");
				index=sc.nextInt();
				p.get(index);
				p.remove(index);
			break;
			
			case 5:
				System.out.println("Exit");
			break;
			
			default:
				System.out.println("Wrong Choice");
			break;
			
			
			}
			
		}while(ch!=5);

	}

}
