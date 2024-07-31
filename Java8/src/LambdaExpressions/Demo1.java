package LambdaExpressions;

interface Operation{
	void msg(String a);
}

interface Maths{
	void calci(int a,int b);
}
public class Demo1 {

	public static void main(String[] args) {
		
		Operation o1=(String n)->System.out.println("Meassgae:"+n);
		o1.msg("Hello everyone");
		

		Maths m1=(int a,int b)->System.out.println("Addtion:"+(a+b));
		m1.calci(10, 20);
		
		Maths m2=(int a,int b)->System.out.println("Subtraction:"+(a-b));
		m2.calci(500, 25);
		
		Maths m3=(int a,int b)->System.out.println("Multiplication:"+(a*b));
		m3.calci(10, 20);
		
		Maths m4=(int a,int b)->System.out.println("Division:"+(a/b));
		m4.calci(40, 20);
	}

}
