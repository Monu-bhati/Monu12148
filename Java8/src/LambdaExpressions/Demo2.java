package LambdaExpressions;
interface S1{
	void info();
	
}
interface S2{
	void info(String Name);
}
interface S3{
	void info(int age, String address);
}
public class Demo2 {

	public static void main(String[] args) {
		
		S1 s1=()->System.out.println("This is non parameter lamabda expression");
		s1.info();
		
		S2 s2=(String n)->System.out.println("My name is "+n);
		s2.info("Ajay Singh");
		
		S3 s3=(int a, String add)->System.out.println("Age:"+a+" Address:"+add);
		s3.info(20, "Thane");

	}

}
