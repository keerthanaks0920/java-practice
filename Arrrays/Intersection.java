package Arrrays;
import java.util.Scanner;
public class Intersection {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int m=s.nextInt();
			int[] arr1=new int[m];
			for(int i=0;i<m;i++) {
				arr1[i]=s.nextInt();
			}
			int n=s.nextInt();
			int[] arr2=new int[n];
			for(int i=0;i<n;i++) {
				arr2[i]=s.nextInt();
			}
			intersection(arr1,arr2);
		}
		s.close();
	}
	public static void intersection(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) 
			{
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					arr2[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
	}
}
