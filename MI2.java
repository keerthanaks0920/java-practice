package patterns;

import java.util.Scanner;

public class MI2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
		int no_spaces=n-i;
		while(no_spaces>0) {
			System.out.print(" ");
			no_spaces--;
		}
		int num=1;
		while(num<=i)
		{
			System.out.print("*");
			num++;
		}
		int dec_trend=i-1;
		while(dec_trend>=1)
		{
			System.out.print("*");
			dec_trend--;
		}
		i++;
		System.out.println();
		}
		s.close();
	}
}
