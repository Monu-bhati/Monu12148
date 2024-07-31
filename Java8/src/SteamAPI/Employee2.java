package SteamAPI;

import java.util.*;

public class Employee2 {

	public static void main(String[] args) {
		List<Employee>e1=new ArrayList<>();
		e1.add(new Employee(101,"Rohit",25));
		e1.add(new Employee(89,"Sohit",30));
		e1.add(new Employee(101,"Shreya",20));
		e1.add(new Employee(101,"Diksha",21));
		
		System.out.println("Sorting Data Acorrding to Age");
		e1.sort(Employee::ComapareByAge);
		for(Employee emp:e1)
			System.out.println(emp.getID()+" "+emp.getNAME()+" "+emp.getAge());
		
		System.out.println("Sorting Data Acorrding to Name");
		e1.sort(Employee::ComapareByname);
		for(Employee emp:e1)
			System.out.println(emp.getID()+" "+emp.getNAME()+" "+emp.getAge());
		
		System.out.println("Sorting Data Acorrding to ID");
		e1.sort(Employee::ComapareById);
		for(Employee emp:e1)
			System.out.println(emp.getID()+" "+emp.getNAME()+" "+emp.getAge());

	}

}
