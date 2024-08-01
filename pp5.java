package patterns;

import java.util.Scanner;

public class pp5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int n1=n-1;
		while(i<=n)
		{
			int spaces=n-i;
			while(spaces>0)
			{
				System.out.print(" ");
				spaces--;
			}
			int stars=2*i-1;
			while(stars>0)
			{
				System.out.print("*");
				stars--;
			}
			i++;
			System.out.println();
		}
		i=n1;
		while(i>0)
		{
			int spaces=n1-i+1;
			while(spaces>0)
			{
				System.out.print(" ");
				spaces--;
			}
			int stars=2*i-1;
			while(stars>0) {
				System.out.print("*");
				stars--;
			}
			i--;
			System.out.println();
		}
		s.close();
	}
}
