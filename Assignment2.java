package patterns;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int spaces=i-1;
			while(spaces>0)
			{
				System.out.print(" ");
				spaces--;
			}
			int stars=1;
			while(stars<=n)
			{
				System.out.print("*");
				stars++;
			}
			i++;
			System.out.println();
		}
		s.close();
	}
}
