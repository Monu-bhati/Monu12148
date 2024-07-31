package DefaultMethod;

interface Maths{
	void ops(int a,int b);
	default void info() {
		System.out.println("This is Deafult Mathod");
	}
}
public class Demo2 {

	public static void main(String[] args) {

		Maths op1=(a,b)->System.out.println("Addition:"+(a+b));
		op1.ops(19, 10);
		
		Maths op2=(a,b)->System.out.println("Subtraction:"+(a+b));
		op2.ops(19, 10);
		
		Maths op3=(a,b)->System.out.println("Mltiplaction:"+(a+b));
		op3.ops(5, 10);
		
		Maths op4=(a,b)->System.out.println("Division:"+(a+b));
		op4.ops(20, 2);
		op4.info();
	}

}
