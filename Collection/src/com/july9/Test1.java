package com.july9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test1 {

	public static void main(String[] args) {
		
		List<Post>p=new ArrayList<Post>();
		
		Scanner sc=new Scanner(System.in);
		int ch;
		
		System.out.println("ArrayList Crud App");
		
		do {
			System.out.println("1.Add data in ArrayList");
			System.out.println("2.Read Data from ArrayList");
			System.out.println("3.Update data in ArrayList");
			System.out.println("4.Remove data from ArrayList");
			
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter postId");
				int pid=sc.nextInt();
				System.out.println("Enter postName");
				String pn=sc.next();
				System.out.println("Enter post comments");
				String pc=sc.next();
				System.out.println("Enter posted date:");
				String date=sc.next();
				//public Post(int postId, String postName, String comments, String date)
				p.add(new Post(pid,pn,pc,date));
				System.out.println("Data added successfully");
			break;
			
			case 2:
				for(Post post:p) {
					System.out.println(post.getPostId()+" "+post.getPostName()+" "+post.getComments()+" "+post.getDate());
				}
				break;
			case 3:
				Post pp=new Post();
				System.out.println("which index u want update");
				int index=sc.nextInt();
				Post post=p.get(index);
				System.out.println("Post name");
				pn=sc.next();
				post.setPostName(pn);
				System.out.println("Enter post comments");
				 pc=sc.next();
				 post.setComments(pc);
				System.out.println("Enter posted date:");
				 date=sc.next();
				 post.setDate(date);
				System.out.println("updated successfully");
			break;
			
			case 4:
				System.out.println("which index u want update");
				 index=sc.nextInt();
		p.get(index);
			p.remove(index);	
				
				System.out.println("Data removed successfully");
			break;
			
			case 5:
				System.out.println("Exit");
			break;
			
			default:
				System.out.println("wrong choice enetered");
			break;
			}
			
			
		}while(ch!=5);

	}

}
