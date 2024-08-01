package patterns;

import java.util.Scanner;

public class pp2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;;
		int n2=n-1;
		while(i<=n)
		{
			int spaces=n-i;
			while(spaces>0)
			{
				System.out.print(" ");
				spaces--;
			}
			int num=1;
			while(num<=i)
			{
				System.out.print(num);
				num++;
			}
			num=num-2;
			while(num>=1)
			{
				System.out.print(num);
				num--;
			}
			i++;
			System.out.println();
		}
		i=n2;
		while(i>0)
		{
			int spaces=n2-i+1;
			while(spaces>0)
			{
				System.out.print(" ");
				spaces--;
			}
			int num=1;
			while(num<=i)
			{
				System.out.print(num);
				num++;
			}
			num=num-2;
			while(num>=1)
			{
				System.out.print(num);
				num--;
			}
			i--;
			System.out.println();
		}
		s.close();
	}
}
