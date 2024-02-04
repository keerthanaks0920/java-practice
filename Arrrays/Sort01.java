package Arrrays;
import java.util.Scanner;
public class Sort01 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int m=s.nextInt();
			int[] arr=new int[m];
			for(int i=0;i<m;i++) {
				arr[i]=s.nextInt();
			}
			sort01(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			t-=1;
		}
		s.close();
	}
	public static void sort01(int[] arr) {
		int moveZeroHere=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				int temp=arr[moveZeroHere];
				arr[moveZeroHere]=arr[i];
				arr[i]=temp;
				moveZeroHere++;
			}
		}
	}
}
