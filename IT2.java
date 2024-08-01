package patterns;

import java.util.Scanner;

public class IT2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int num=n-i+1;
			int j=1;
			while(j<=num)
			{
				System.out.print(num);
				j++;
			}
			System.out.println();
			i++;
		}
		s.close();
	}
}
