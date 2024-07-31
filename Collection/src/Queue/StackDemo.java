package Queue;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(23);
		st.push(20);
		st.push(50);
		st.push(40);
		st.push(70);
		
		System.out.println(st);
		
		System.out.println("Size os the Stack:"+st.size());
		System.out.println("Remove the Element:"+st.pop());
		System.out.println(st);
		System.out.println("Show the First Element:"+st.peek());
		System.out.println(st);
	}

}
