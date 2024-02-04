package Arrrays;
import java.util.Scanner;
public class PairSum {
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int arr[]=inputArray(s);
		int sum=pairSum(arr,x);
		System.out.println(sum);
		s.close();
	}
	public static int[] inputArray(Scanner s)
	{	
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int pairSum(int[] arr,int x) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==x) 
				{
					count++;
				}
			}
		}
		return count;
	}
}
