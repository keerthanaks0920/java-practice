package Arrrays;
import java.util.Scanner;
public class ArrangeArrays {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int left=0;
		int right=n-1;
		int element=1;
		for(int i=0;i< arr.length;i++) {
			if(element%2==1) {
				arr[left]=element;

				left+=1;
				}
			else {
				arr[right]=element;
				right-=1;
			}
			element++;
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		}
		s.close();
	}
}
