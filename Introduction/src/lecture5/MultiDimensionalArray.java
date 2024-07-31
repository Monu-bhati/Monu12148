package lecture5;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[3][];
		
		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[6];
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=count++;
			}
		}

		System.out.println("Print All elements of array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		

	}

}
