package Arrrays;
import java.util.Scanner;
public class ArraySum {
	public static int[] takeInput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		s.close();
		return arr;
	}
	public static int SumOfArray(int arr[]) {
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String args[]) {
		int arr[]=takeInput();
		int sum=SumOfArray(arr);
		System.out.println("Sum of the elements of the array is :"+sum);
	}
}
