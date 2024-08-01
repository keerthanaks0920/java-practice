package patterns;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int n1=n-1;
		System.out.println("*");
		while(i<=n)
		{
			System.out.print("*");
			int inc_p=1;
			while(inc_p<=i)
			{
				System.out.print(inc_p);
				inc_p++;
			}
			int dec_p=i-1;
			while(dec_p>0) {
				System.out.print(dec_p);
				dec_p--;
			}
			System.out.print("*");
			i++;
			System.out.println();
		}
		i=n1;
		while(i>0)
		{
			System.out.print("*");
			int num=1;
			while(num<=i)
			{
				System.out.print(num);
				num++;
			}
			num=num-2;
			while(num>0)
			{
				System.out.print(num);
				num--;
			}
			System.out.print("*");
			i--;
			System.out.println();
		}
		System.out.println("*");
		s.close();
	}
}
