package patterns;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1;
		int n=s.nextInt();
		while(i<=n)
		{
			int j=1;
			int ch='A';
			while(j<=n-i+1)
			{
				System.out.print((char)ch);
				ch=(char)(ch+1);
				j++;
			}
			System.out.println();
			i++;
		}
		s.close();
	}
}
