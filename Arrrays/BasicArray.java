package Arrrays;
import java.util.Scanner;
public class BasicArray {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+ "th elememt:");
			arr[i]=s.nextInt();
		}
		System.out.println("The elements of the array are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		s.close();
	}
}
