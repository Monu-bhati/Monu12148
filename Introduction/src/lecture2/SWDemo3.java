package lecture2;

import java.util.Scanner;

public class SWDemo3 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("press1: Name of the Student \npress2: age of the student \npress3: Address of the student");
       
       int ch = sc.nextInt();
       
       switch(ch) {
       
       case(1):
    	   System.out.println("Enter the Name: ");
           String name = sc.next();
           System.out.println("Name of the Student is "+name);
        break;   
        
       case(2):
    	   System.out.println("Enter the age: ");
           int age = sc.nextInt();
           System.out.println("Age of the Student is "+age);
        break;
       case(3):
    	   System.out.println("Enter the address: ");
           String add = sc.next();
           System.out.println("Address of the Student is "+add);
        break;
       case(4):
    	   System.out.println("Byee Byeee");
       break;
       default:
    	   System.out.println("Worng choice");
       }
           
           
           
           
        		   }
	}


