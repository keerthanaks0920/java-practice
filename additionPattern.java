package patterns;

import java.util.Scanner;

public class additionPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			int sum=0;
			while(j<=i)
			{
				System.out.print(j);
				if(j==i)
				{
					System.out.print("=");
				}
				else
				{
					System.out.print("+");
				}
				sum=sum+j;
				j++;
			}
			System.out.println(sum);
			i++;
		}
		s.close();
	}
}
