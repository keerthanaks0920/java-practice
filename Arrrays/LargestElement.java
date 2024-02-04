package Arrrays;
import java.util.Scanner;
public class LargestElement {
	public static void main(String args[]) {
		int arr[]=takeInput();
		int max=largest(arr);
		System.out.println("The largest element of the array is "+ max);
	}
	public static int[] takeInput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element at "+ i +"th index: ");
			arr[i]=s.nextInt();
		}
		s.close();
		return arr;
	}
	public static int largest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
