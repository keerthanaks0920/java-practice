package patterns;

import java.util.Scanner;

public class pp3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=n-1;
		int i=1;
		while(i<=n)
		{
			int sp1=i-1;
			while(sp1>0)
			{
				System.out.print(" ");
				sp1--;
			}
			System.out.print(i);
			int sp2=n-2*(i-1)+1;
			while(sp2>0)
			{
				System.out.print(" ");
				sp2--;
			}
			if(i<n)
			{
				System.out.print(i);
			}
		    i++;
			System.out.println();
		}
		i=n1;
		while(i>0)
		{
			int spaces=i-1;
			while(spaces>0)
			{
				System.out.print(" ");
				spaces--;
			}
			System.out.print(i);
			int sp2=n1-2*(i-1)+2;
			while(sp2>0)
			{
				System.out.print(" ");
				sp2--;
			}
			System.out.print(i);
			i--;
			System.out.println();
		}
		s.close();
	}
}
