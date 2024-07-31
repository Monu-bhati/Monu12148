package lecture5;

public class MinMax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		int a[]= {3,68,12,4,0,50};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println("max value= " + max + "\nmin value= " + min);
	}

}
