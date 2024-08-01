package patterns;

import java.util.Scanner;

public class ReverseNumberPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=i;
			while(j>0)
			{
				System.out.print(j+" ");
				j-=1;
			}
			System.out.println();
			i+=1;
		}
		s.close();
	}
}
