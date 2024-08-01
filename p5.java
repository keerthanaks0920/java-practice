package patterns;

import java.util.Scanner;
public class p5{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			if(i==1)
			{
				System.out.println(i);
				for(int j=1;j<=2;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
			else {
				System.out.print(i);
				for(int j=1;j<=i-1;j++)
				{
					System.out.print(0);
				}
				System.out.print(i);
				System.out.println();
			}
			}
		s.close();
	}
}