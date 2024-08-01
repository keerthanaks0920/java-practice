package patterns;

import java.util.Scanner;

public class MI1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int no_spaces=n-i;
			while(no_spaces>0)
			{
				System.out.print(" ");
				no_spaces--;
			}
			int no_stars=i;
			while(no_stars>0)
			{
				System.out.print("*");
				no_stars--;
			}
			i++;
			System.out.println();
		}
		s.close();
	}
}
