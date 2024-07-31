package animal;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Which animal's sound u want");
		String Voice=sc.next();
		Animal a1=ChoicAnimal.CreateAnimla(Voice);
		a1.getSound();

	}

}
