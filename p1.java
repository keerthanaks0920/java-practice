package patterns;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			char ch=(char)('A');
			while(j<=i)
			{
				System.out.print(ch);
				ch=(char)(ch+1);
				j++;
			}
			i++;
			System.out.println();
		}
		s.close();
	}
}
