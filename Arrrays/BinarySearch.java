package Arrrays;

public class BinarySearch {
	public static void main(String args[]) {
		int[] arr= {1,4,7,10,20,30};
		int index=binarySearch(arr,30);
		System.out.println("Index is "+index );
		
	}
	public static int binarySearch(int[] arr, int x) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if (arr[mid]>x) {
				  end=mid-1;  
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
}
