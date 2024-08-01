package patterns;

import java.util.Scanner;

public class OddPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1,maxval=2*n-1;
		while(i<=n)
		{
			int j=1;
			int val=2*i-1;
			while(j<=n)
			{
				System.out.print(val);
				val=val+2;
				if(val>maxval)
				{
					val=1;
				}
				j++;
			}
			System.out.println();
			i++;
		}
		s.close();
	}
}
