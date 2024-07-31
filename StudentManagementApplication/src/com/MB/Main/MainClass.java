package com.MB.Main;

import java.util.Scanner;

import com.MB.Dao.StudentDao;
import com.MB.pojo.Students;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name=sc.next();
		
		System.out.println("Welcome to Student Management Protal "+name);
		
		int ch=0;
		do {
			System.out.println("Press 1: To insert Data");
			System.out.println("Press 2: To Update Data");
			System.out.println("Press 3: To Delete Data");
			System.out.println("Press 4: To Read Data");
			System.out.println("Press 5: Exit");
			System.out.println("\nEnter your Choose");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case(1):{
				System.out.println("Enter the Student name: ");
				String sname=sc.next();
				System.out.println("Enter the Student Phone no: ");
				String sphoneno=sc.next();
				System.out.println("Enter the Student Address: ");
				String scity=sc.next();
				Students st=new Students(sname,sphoneno,scity);
				boolean ans = StudentDao.InsertStudentData(st);
				System.out.println("Data inserted successfully");
				
			}
			break;	
			
			case(2):{
				
				System.out.println("Press 1:to Update Name");
				System.out.println("Press 2:to Upadte Phone no");
				System.out.println("Press 3:to Update Address");
				
				int val=sc.nextInt();
				if(val==1) {
					System.out.println("Enter name which u want to update: ");
					String name1=sc.next();
					System.out.println("Enter Id: ");
					int id=sc.nextInt();
					Students sd=new Students();
					sd.setsName(name1);
					boolean u1=StudentDao.UpdateStudentData(val, name1, id, sd);
					System.out.println("Name is Updated Successfully");
				}else if(val==2) {
					System.out.println("Enter name which u want to update: ");
					String phone1=sc.next();
					System.out.println("Enter Id: ");
					int id=sc.nextInt();
					Students sd=new Students();
					sd.setsName(phone1);
					boolean u1=StudentDao.UpdateStudentData(val, phone1, id, sd);
					System.out.println("Phone no is Updated Successfully");
				}else if(val==3) {
					System.out.println("Enter Address which u want to update: ");
					String city=sc.next();
					System.out.println("Enter Id: ");
					int id=sc.nextInt();
					Students sd=new Students();
					sd.setsName(city);
					boolean u1=StudentDao.UpdateStudentData(val, city, id, sd);
					System.out.println("Address no is Updated Successfully");
				}else {
					System.out.println("Data is not Updated");
				}
			}
			break;
			case(3):{
				System.out.println("Enter Id which u want delete the data");
				int id=sc.nextInt();
				StudentDao.DeleteStudentData(id);
				System.out.println(id+"Id is Deleted from Database");
			}
			break;
			case(4):{
				StudentDao.ShowAllStudentsData();
				
			}
			break;	
			case(5):{
				System.out.println("Byee Byee!!!!");
			}
			break;	
			
			default:{
				System.out.println("Wrong Choice");
			}
				
			}			
		}while(ch!=5);

	}

}
