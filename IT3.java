package patterns;

import java.util.Scanner;

public class IT3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int spaces=n-i;
			while(spaces>0)
			{
				System.out.print(".");
				spaces--;
			}
			int inc_p=i,num=i;
			while(inc_p>0)
			{
				System.out.print(num);
				num++;
				inc_p--;
			}
			int dec_p=i-1;
			num=num-2;
			while(dec_p>0)
			{
				System.out.print(num);
				dec_p--;
				num--;
			}
			i++;
			System.out.println();
		}
		s.close();
	}
}
