package Arrrays;

public class SwapSimple {
	public static void main(String args[]) {
		int[] arr= {9,3,6,12,4,32};
		printArray(arr);
		swap(arr);
		printArray(arr);
	}
	public static void swap(int[] arr) {
		for(int i=0;i<arr.length;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
