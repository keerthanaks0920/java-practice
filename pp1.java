package patterns;

import java.util.Scanner;

public class pp1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int spaces=n-i;
			int stars=2*i-1;
			while(spaces>0)
			{
				System.out.print(" ");
				spaces--;
			}
			while(stars>0)
			{
				System.out.print("*");
				stars--;
			}
			i++;
			System.out.println();
		}
		s.close();
	}
}
