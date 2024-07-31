package lecture5;

public class RemoveDuplicatElements {

	public static int removeDuplication (int arr[], int n) {
		int[] temp =new int[n];
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}temp[j++]=arr[n-1];
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,3,3,4,5,5,6,6,6,7,8,9,9,9,10,10};
		int n = a.length;
		
		System.out.println("Print Original Array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

		System.out.println();
		int NA= removeDuplication(a,n);
		for(int i=0;i<NA;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
