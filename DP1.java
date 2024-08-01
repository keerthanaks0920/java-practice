package patterns;

import java.util.Scanner;

public class DP1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1,j,k;
		int n1=(n+1)/2;
		int n2=n1-1;
		while(i<=n1)
		{
			k=n1-i;
			while(k>0)
			{
				System.out.print(" ");
				k--;
			}
			j=2*i-1;
			while(j>0)
			{
				System.out.print("*");
				j--;
			}
			i++;
			System.out.println();
		}
		i=n2;
		while(i>0)
		{
			j=n2-i+1;
			while(j>0)
			{
				System.out.print(" ");
				j--;
			}
			k=2*i-1;
			while(k>0) {
				System.out.print("*");
				k--;
			}
			i--;
			System.out.println();
		}
		s.close();
	}
}
