package lecture9;

abstract class Operation{
	
	abstract void add(int a, int b);
	abstract void sub(int a, int b);
	abstract void multi(int a, int b);
	abstract void divi(int a, int b);

	
}

class op extends Operation{
	
	void add(int a,int b) {
		int sum=a+b;
		System.out.println("Addition of 2 number:"+sum);
		
	}

	@Override
	void sub(int a, int b) {
		int sub=a-b;
		System.out.println("Subtraction of 2 number:"+sub);
		
	}

	@Override
	void multi(int a, int b) {
		int multi=a*b;
		System.out.println("Multiplecation of 2 number:"+multi);
		
	}

	@Override
	void divi(int a, int b) {
		int div=a/b;
		System.out.println("Division of 2 number:"+div);
		
	}
	
}
public class RevisionQuestion {

	public static void main(String[] args) {
		op m1=new op();
		m1.add(5, 7);
		m1.divi(10, 5);
		m1.multi(6, 2);
		m1.sub(10, 7);
		

	}

}
