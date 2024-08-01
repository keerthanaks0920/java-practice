package patterns;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int col=1;
			while(col<=2*n)
			{
			int j=1;
			while(j<=n-i+1)
			{
				System.out.print(j);
				j++;
				col++;
			}
			int no_star=2*(i-1);
			while(no_star>0)
			{
				System.out.print("*");
				no_star--;
				col++;
			}
			j--;
			while(j>0)
			{
				System.out.print(j);
				j--;
				col++;
			}
			}
			System.out.println();
			i++;
		}
		s.close();
	}
}
