package lecture6;

public class Test2 {

	public static void main(String[] args) {
		
		String n1 ="Work";
		String n2 ="Hard";
		 System.out.println(n1.concat(n2));
		 
		 System.out.println(n2.replace("H", "M"));
		 
		 System.out.println(n2.replaceAll("Hard", "Smart"));
		 
		 System.out.println(n1.indexOf("W"));

		 String ss = " Java is Programming Language";
		 if(ss.contains("is")) {
			 System.out.println("String Available");
		 }else {
			 System.out.println("String not Available");
		 }
		 
		 String str1="               learn java              by yourself";
		 System.out.println(str1.trim());
		 
		 String str2="Java is platform indepenent";
		 System.out.println(str2.substring(0 ,10));
	}

}
